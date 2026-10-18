class Solution {
   fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

     val sortedNums = nums.sorted()

    for(j in 0 until nums.size) {
        if(j > 0 && nums[j] == nums[j - 1]) continue

        var left = j + 1
        var right = nums.size - 1

        while(left < right){
            val leftNum = sortedNums[left]
            val rightNum = sortedNums[right]
            val treeSum = sortedNums[j] + leftNum + rightNum
            if(treeSum == 0) {
                result.add(listOf(sortedNums[j], sortedNums[left], sortedNums[right]))
                break
            }

            if(treeSum > 0){
                right--
            }else{
                left++
            }

        }

    }
    return result
}
}
