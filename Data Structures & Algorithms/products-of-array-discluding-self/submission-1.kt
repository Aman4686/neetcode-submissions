class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    val left = IntArray(nums.size) { 1 }
    val right = IntArray(nums.size) { 1 }


    for (i in 1 until nums.size) {
        left[i] = nums[i - 1] * left[i - 1]
    }

    for (k in nums.size - 2 downTo 0) {
        right[k] = nums[k + 1] * right[k + 1]
    }

    for(l in 0 until nums.size){
        result[l] = left[l] * right[l]
    }

    return result
}
}
