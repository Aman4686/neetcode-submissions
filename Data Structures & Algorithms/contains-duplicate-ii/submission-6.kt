class Solution {
       fun containsNearbyDuplicate(nums: IntArray = intArrayOf(1,0,1,0), k: Int = 1): Boolean {
        var left = 0
        var right = k

        while(left < nums.size - 1){

            for(i in right downTo   left + 1) {
                println("left ${nums[left]} == i ${nums[i]}")
                if(nums[left] == nums[i]) return true
            }
            println("========")
            left++
            if(right < nums.size) right++
        }
        return false
    }
}
