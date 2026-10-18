class Solution {
  fun majorityElement(nums: IntArray): Int {
    val index = ceil(nums.size / 2.0)
    nums.sort()
    return nums[index.toInt()]
}
}
