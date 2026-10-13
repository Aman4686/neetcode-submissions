class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0 
        var right = nums.size - 1
        var lastValidPosition = 0

        while(left <= right){
            val mid = left + (right - left) / 2
            println(mid)
            val midNum = nums[mid]
            when{
                midNum == target -> {
                    return mid
                }
                midNum < target -> {
                    left = mid + 1
                    lastValidPosition = left
                }
                midNum > target -> {
                    right = mid - 1
                }
            }
        }

        return lastValidPosition
    }
}

