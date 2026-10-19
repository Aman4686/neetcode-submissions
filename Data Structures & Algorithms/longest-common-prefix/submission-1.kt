class Solution {
fun longestCommonPrefix(strs: Array<String> = arrayOf("ab", "a")): String {
    if(strs.size == 1) return strs[0]

    val baseStr = strs.minBy { it.length }
    var result = ""
    for(i in baseStr.indices){
        val char = baseStr[i]

        for(str in strs){
            if(char != str[i]){
                return result
            }
        }
        result += char
    }
    return result
}

}