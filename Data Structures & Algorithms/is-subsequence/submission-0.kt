class Solution {
   fun isSubsequence(s: String = "nkote", t: String = "neetcodtnode"): Boolean {
    var searchIndex = 0
    val resultWord = StringBuilder()

    for(char in t) {
        if(resultWord.toString() == s) return true

        val searchChar = s[searchIndex]

        if(char == searchChar) {
            resultWord.append(searchChar)
            searchIndex++
        }
    }

    return resultWord.toString() == s
}
}
