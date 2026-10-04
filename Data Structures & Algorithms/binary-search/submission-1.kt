class Solution {
fun search(
    nums: IntArray = intArrayOf(-1, 0, 2, 4, 6, 8),
    target: Int = 8,
): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val midIndex = left + (right - left) / 2
        val midNum = nums[midIndex]

        when {
            midNum == target -> return midIndex
            midNum < target -> left = midIndex + 1
            else -> right = midIndex - 1
        }
    }

    return -1
}
}
