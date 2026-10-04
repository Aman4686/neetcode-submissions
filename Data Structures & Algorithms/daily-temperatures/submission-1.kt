class Solution {
    fun dailyTemperatures(nums: IntArray = intArrayOf(73,74,75,71,69,72,76,73)): IntArray {

    val stack = ArrayDeque<Int>()

    val result = IntArray(nums.size) { 0 }

    for (i in 0 until nums.size) {
        val nextNum = nums[i]

        if(stack.isNotEmpty()){

            while(stack.isNotEmpty() && nums[stack.last()] < nextNum){
                result[stack.last()] = i - stack.last()
                stack.removeLast()
            }
        }



        stack.addLast(i)
    }

    return result
}
}
