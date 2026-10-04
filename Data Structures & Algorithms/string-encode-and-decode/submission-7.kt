class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(word in strs){
            result += "${word.length}#$word"
        }
    
        return result
    }

fun decode(str: String): List<String> {

    val result = mutableListOf<String>()
    var i = 0
    var j = 0
    while (i < str.length) {
        if(str[i] == '#'){
            val sub = str.substring(j, i)
            println(sub)
            val wordLength = sub.toInt()

            val subString = str.substring(i + 1, i + 1 + wordLength)
            println(subString)
            result.add(subString)
            
            j = i+ 1 + wordLength
            i += wordLength
        }

        i++
    }

    return result
}


}
