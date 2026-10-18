class Solution {
    var result = 0

fun subsetXORSum(nums: IntArray): Int {
    recursiveSubsetXORSum(nums.toList())

    return result + nums.sum()

}

fun recursiveSubsetXORSum(nums: List<Int>) {
    if(nums.isEmpty() || nums.size == 1) return


    result += sumXor(nums)

    if(nums.size < 3) return

    for(i in nums.indices) {
        val includeElement = mutableListOf(nums[0])
        val excludeElement = nums.toMutableList().also { it.removeAt(i) }

        recursiveSubsetXORSum(excludeElement)
        recursiveSubsetXORSum(includeElement)
    }
}

fun sumXor(nums: List<Int>): Int{
    var result = 0
    for (i in nums.indices) {
        result = result xor nums[i]
    }
    return result
}
}
