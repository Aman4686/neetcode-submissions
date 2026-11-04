class Solution {
   fun rotate(nums: IntArray, k: Int) {
    for(i in 1..k){
        val last = nums.last()
        for(j in nums.size - 2 downTo 0){
            nums[j + 1] = nums[j]
        }
        nums[0] = last

    }
}
}
