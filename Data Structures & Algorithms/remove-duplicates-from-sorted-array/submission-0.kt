class Solution {
   
fun removeDuplicates(nums: IntArray): Int {
    val set = nums.toSet()
   
    var index = 0
    for(num in set){
        nums[index] = num
        index++
    }
    return set.size
}
}
