class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
    val current = mutableListOf<Int>()
    var result = mutableListOf<List<Int>>()


    fun backtrack(startIndex: Int){
        result.add(current.toList())
        for(i in startIndex until nums.size){
            current.add(nums[i])
            backtrack(i + 1)
            current.removeLast()
        }
    }
    
    backtrack(0)
    return result
}
}
