class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(word in strs){
            result += "${word.length}#$word"
        }
        println(result)
        return result
    }

  fun decode(str: String): List<String> {
//    str.toCharArray().forEachIndexed { index, value ->
//        if(value == '#'){
//            val wordLength = 
//        }
//    }
    if(str.isEmpty()) return emptyListOf<String>("")

    return str.split(Regex("\\d+#")).filter{ 
        it.isNotEmpty()
    }
}

}
