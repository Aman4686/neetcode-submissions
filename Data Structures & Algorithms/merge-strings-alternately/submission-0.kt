class Solution {
   fun mergeAlternately(word1: String = "abc", word2: String = "fghdfg"): String {
    var result = ""
    val iterator = word1.length + word2.length

    var first = 0
    var second = 0
    while (result.length != iterator){
        if(first < word1.length){
            result += word1[first]
            first++
        }

        if(second < word2.length){
            result += word2[second]
            second++
        }

    }

    return result
}
}
