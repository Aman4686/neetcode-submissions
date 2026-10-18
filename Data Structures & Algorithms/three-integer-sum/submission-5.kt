class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

     val numsSet = nums.toSet()
    if(numsSet.size == 1 && numsSet.contains(0)) return listOf(listOf(0,0,0))
    
    val sortedNums = nums.sorted()
    println(sortedNums)
    for(j in 0 until nums.size) {
        if(j > 0 && sortedNums[j] == sortedNums[j - 1]) continue

        var left = j + 1
        var right = nums.size - 1

        while(left < right){
            val leftNum = sortedNums[left]
            val rightNum = sortedNums[right]

            val treeSum = sortedNums[j] + leftNum + rightNum

            when{
                treeSum > 0 -> right--
                treeSum < 0 -> left++
                else -> {
                    result.add(listOf(sortedNums[j], leftNum, rightNum))
                    left++
                }
            }

        }

    }
    return result
}
}
