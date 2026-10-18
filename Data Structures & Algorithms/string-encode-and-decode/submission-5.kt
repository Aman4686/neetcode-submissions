class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(word in strs){
            result += "${word.length}$word"
        }
    
        return result
    }

fun decode(str: String): List<String> {

    val result = mutableListOf<String>()
    var index = 0

    while (index < str.length) {
        val wordLength = str[index].digitToInt()
        if(wordLength == 0) {
            result.add("")
            index++
            continue
        }

        val subString = str.substring(index + 1, index + 1 + wordLength)

        result.add(subString)
        index += wordLength + 1

    }

    return result
}

}
