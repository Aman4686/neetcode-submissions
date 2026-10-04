class Solution {
 fun lengthOfLongestSubstring(s: String = "aaaaaaaaaaa"): Int {
    if(s.isEmpty()) return 0
    if(s.length == 1) return 1

    val window = hashSetOf<Char>()

    var left = 0
    var result = Int.MIN_VALUE
    for(right in 0 until s.length){
        //val sunSequence = s.substring(left, right+1)
        //println(sunSequence)
        while (window.contains(s[right])){
            window.remove(s[left])
            left++
        }
        window.add(s[right])


        val tempResult = (right - left) + 1
        if(tempResult > result){
            result = tempResult
        }
    }

    return result
}

}
