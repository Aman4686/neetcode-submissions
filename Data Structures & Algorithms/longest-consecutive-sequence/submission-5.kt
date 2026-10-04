class Solution {
fun longestConsecutive(nums: IntArray): Int {
    if(nums.isEmpty()) return 0
    val numsSet = nums.toSet()
    var longest = 1
    for(num in nums){

         if(num - 1 !in numsSet){
            var length = 0
            while ((num + length) in numsSet){
                length++
            }
            longest = max(longest, length)
        }
    }


    return longest
}
}
