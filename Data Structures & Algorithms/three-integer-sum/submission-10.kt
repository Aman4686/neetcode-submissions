class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

     val sortedNums = nums.sorted()


  //  println(sortedNums)
    for(j in 0 until nums.size) {
       // println(j > 0 && sortedNums[j] == sortedNums[j - 1])
        val currentNum = sortedNums[j]
        if(j > 0 && currentNum == sortedNums[j - 1]) continue

        var left = j + 1
        var right = nums.size - 1

        while(left < right){
            val leftNum = sortedNums[left]
            val rightNum = sortedNums[right]

            val treeSum = currentNum + leftNum + rightNum
         //   println("${currentNum} [$leftNum..$rightNum]")

            when{
                treeSum > 0 -> right--
                treeSum < 0 -> left++
               else -> {
                    result.add(listOf(currentNum, sortedNums[left], sortedNums[right]))
                    left++
                    right--
                    while (left < right && sortedNums[left] == sortedNums[left - 1]) left++
                    while (left < right && sortedNums[right] == sortedNums[right + 1]) right--
                }
            }

        }

    }
    return result
}
}