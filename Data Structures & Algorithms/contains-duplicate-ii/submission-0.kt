class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var left = 0
        var right = k

        while(left < nums.size - 1){

            for(i in right downTo left + 1) {
                if(nums[left] == nums[i]) return true
            }
            
            left++
            if(right < nums.size) right++
        }
        return false
    }
}
