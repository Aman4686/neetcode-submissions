class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var fast = 0
        var slow = 0
        while(true){
            slow = nums[slow]
            fast = nums[nums[fast]]
            if(slow == fast) break
        }
        

        var slow2 = 0
        while(true){
            slow2 = nums[slow2]
            fast = nums[fast]
            if(slow2 == fast) return fast
        }

        println(slow)
        return 0
    }
}
