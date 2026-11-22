class Solution {
fun scoreOfString(s: String): Int {
    var result = 0
    for(i in 1 until s.length){

        result += abs( s[i - 1].code - s[i].code)
    }
    return result
}
}
