class Solution {
    fun pivotIndex(nums: IntArray): Int {
        if(nums.size == 1) return 0
    
        var leftSum = 0
        var rightSum = nums.sum()

        for(i in 0 until nums.size){
            val pivot = nums[i]
            rightSum -= pivot
            if(i > 0) leftSum += nums[i - 1]

            if(leftSum == rightSum) return i
        }

        return -1
    }
}
