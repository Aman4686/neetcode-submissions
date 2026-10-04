class Solution {
 fun majorityElement(nums: IntArray): Int {
    val index = if(nums.size % 2 == 0){
        ceil(nums.size / 2.0).toInt()
    }else{
        nums.size / 2
    }
    nums.sort()
    return nums[index]
}
}
