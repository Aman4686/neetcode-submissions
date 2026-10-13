class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if(num == 1) return true

        var left = 0 
        var right = 46340

        while(left <= right){
            val mid = left + (right - left) / 2
            val squreValue = mid * mid
            println(squreValue)
            when{
                squreValue == num -> return true
                squreValue < num -> left = mid + 1
                else -> right = mid - 1
            }

        }

        return false
    }
}
