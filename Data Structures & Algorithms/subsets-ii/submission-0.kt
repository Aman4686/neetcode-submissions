class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = hashSetOf<List<Int>>()
        val current = mutableListOf<Int>()
        
     
        fun dfs(start: Int){

            result.add(current.toList())
            println(current)
            for(i in start until nums.size){
                current.add(nums[i])
                dfs(i + 1)
                current.removeLast()
            }

        }

        dfs(0)

        return result.map{it.toList()}
    }
}
