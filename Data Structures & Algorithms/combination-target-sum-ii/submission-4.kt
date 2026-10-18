class Solution {
   
fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    candidates.sort()
    val current = mutableListOf<Int>()
    val result = hashSetOf<List<Int>>()
    var sum = 0

    fun dfs(startIndex: Int){
        if(sum == target){
            result.add(current.toList())
             return
        }

        if(sum > target) return

        for(i in startIndex until candidates.size){
            current.add(candidates[i])
            sum += candidates[i]
            dfs(i + 1)
            current.removeLast()
            sum -= candidates[i]
        }
    }
    dfs(0)

    return  result.toList()
}
}
