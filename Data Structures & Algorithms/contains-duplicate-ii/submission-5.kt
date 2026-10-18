class Solution {
          fun containsNearbyDuplicate(nums: IntArray = intArrayOf(1,0,1,1), k: Int = 1): Boolean {
        var left = 0
        var right = k

        while(left < nums.size - 2){

            for(i in left + 1 until  right + 1) {
                if(nums[left] == nums[i]) return true
            }
            println("========")
            left++
            if(right < nums.size) right++
        }
        return false
    }
}
