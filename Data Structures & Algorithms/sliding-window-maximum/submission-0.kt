class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    var right = k

    val arr = ArrayDeque<Int>()

    val result = mutableListOf<Int>()
    for(i in 0 until k){
        arr.addLast(nums[i])
    }
    result.add(arr.max())
    while(right < nums.size){
        val rightNum = nums[right]
        right++
        arr.addLast(rightNum)
        arr.removeFirst()
        result.add(arr.max())
    }
   // println(result)
    return result.toIntArray()
}
}
