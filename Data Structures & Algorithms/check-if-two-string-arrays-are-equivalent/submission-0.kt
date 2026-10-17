class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        var a = ""
        var b = ""

        word1.forEach{
            a += it
        }
           word2.forEach{
            b += it
        }

        return a == b
    }
}
