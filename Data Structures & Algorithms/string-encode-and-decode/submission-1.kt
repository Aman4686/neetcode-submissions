class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(word in strs){
            result += "${word.length}#$word"
        }
    
        return result
    }

fun decode(str: String): List<String> {
    val arr = str.toCharArray()
    val result = mutableListOf<String>()
    arr.forEachIndexed { index, value ->
        if(value == '#'){
            val wordLength = arr[index-1].digitToInt() + 1
            
            if(wordLength == 0){
                result.add("")
            }else{
                val word = str.substring(index+1, (index + wordLength))
                result.add(word)
            }
        }
    }
   return result
}

}
