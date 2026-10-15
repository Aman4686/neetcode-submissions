class Solution {
   

fun removeDuplicates(nums: IntArray): Int {
    if(nums.size == 1) return 1
    if(nums.isEmpty()) return 0
    
    var startIndex = 0
    var startNum = nums[0]

    for(i in 1 until nums.size){
        val num = nums[i]

        if(startNum != num){
            startIndex++
            startNum = num
            nums[startIndex] = num
        }
    }

    return startIndex + 1
}
}
