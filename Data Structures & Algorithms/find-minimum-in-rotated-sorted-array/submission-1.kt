class Solution {
 fun findMin(nums: IntArray = intArrayOf(3,4,5,6,1,2)): Int {
    if(nums.first() < nums.last()) return nums.first()

    var left = 0
    var right = nums.size - 1
    var res = Int.MAX_VALUE

    while (left <= right){
        val mid = left + (right - left) / 2

        when {
            nums[mid] > nums[0] -> left = mid + 1
            nums[mid] <= nums[0] -> {
                if(res > nums[mid]) res = nums[mid]
                right = mid - 1
            }
        }
    }
    
    return res
}
}
