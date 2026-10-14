class Solution {
   fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
    val current = mutableListOf<Int>()
    val result = mutableListOf<List<Int>>()
    var sum = 0

    fun dfs(startIndex: Int) {

        if(sum > target) return

        if(sum == target){
            result.add(current.toList())
            return
        }
       
        for(i in startIndex until nums.size){
            current.add(nums[i])
            sum += nums[i]
            if(sum > target){
                dfs(i + 1)
            }else{
                dfs(i)
            }

            current.removeLast()
            sum -= nums[i]
        }
    }

    dfs(0)
    return result
}
}
