class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(word in strs){
            result += "${word.length}#$word"
        }
    
        return result
    }

fun decode(str: String): List<String> {
    println(str)

    val result = mutableListOf<String>()
    var index = 0

    while(index < str.length){
        val char = str[index]
    
        if(char == '#'){
            val wordLength = str[index-1].digitToInt()
            if(wordLength == 0){
                result.add("")
                index++
                continue
            }
            println("$wordLength ${index+1} ${index + wordLength-1} <----")
            val subString = str.substring(index+1, index+1 + wordLength)
            println("$subString  <---- subString")
            result.add(subString)
            index += wordLength
        }else{
            index++
        }
    }
    
   return result
}

}
