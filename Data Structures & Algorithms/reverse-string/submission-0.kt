class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1

        while(left <= right){
            val saveLeft = s[left]
            s[left] = s[right]
            s[right] = saveLeft
            left++
            right--
        }

        return Unit
    }
}