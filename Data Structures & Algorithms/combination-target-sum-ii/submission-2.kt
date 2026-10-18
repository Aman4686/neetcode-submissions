class Solution {
   
fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val current = mutableListOf<Int>()
    val result = hashSetOf<List<Int>>()
    val uniquSets = hashSetOf<Set<Int>>()
    var sum = 0

 fun dfs(startIndex: Int){
        val currentSet = current.toSet()
        if(sum == target){
            uniquSets.add(currentSet)

            if(currentSet in uniquSets && currentSet.size != current.size){
                result.add(current.toList())
                uniquSets.remove(currentSet)
            }
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
    val totalResult = result.toList() + uniquSets.map { it.toList() }

    return totalResult
}
}
