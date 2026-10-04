class Solution {
fun findMin(nums: IntArray = intArrayOf(9,-5,-2,0,3)): Int {
    if(nums.first() < nums.last()) return nums.first()

    if(nums.size == 2 && nums.first() > nums.last()) {
        return nums.last()
    }

    var left = 0
    var right = nums.size - 1
    var res = Int.MAX_VALUE

    while (left <= right){
        val mid = left + (right - left) / 2

        // println("mid $mid")
        // printSearch(nums, left, right)

        when {
            nums[mid] > nums.last() -> left = mid + 1
            nums[mid] <= nums.last() -> {
                if(res > nums[mid]) res = nums[mid]
                right = mid - 1
            }
        }
    }

    return res
}
}
