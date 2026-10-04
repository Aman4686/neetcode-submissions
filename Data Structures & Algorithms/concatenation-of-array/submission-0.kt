class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        var counter = 0
        for(i in 0 until result.size){
            result[i] = nums[counter]
            if(counter == nums.size - 1){
                counter = 0
            }else{ 
                counter++
            }
            

        }
        return result
    }
}
