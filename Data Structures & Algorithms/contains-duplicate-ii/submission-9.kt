class Solution {
       fun containsNearbyDuplicate(nums: IntArray = intArrayOf(1,2,2,3), k: Int = 2): Boolean {
        var left = 0
        var right = if(k >= nums.size){
            nums.size - 1
        }else{
            k
        }


        while(left < nums.size - 1){

            for(i in right downTo   left + 1) {
        
                if(nums[left] == nums[i]) return true
            }
        
            left++
            if(right < nums.size - 1) {
                right++
            }
        }
        return false
    }
}
