class Solution {
   
fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    candidates.sort()
  //  println(candidates.toList())

    val current = mutableListOf<Int>()
   // val result = mutableListOf<List<Int>>()
    val result = hashSetOf<List<Int>>()
    var sum = 0
  //  val uniquNum = hashSetOf<Int>()
    val uniquNum = hashSetOf<List<Int>>()

    fun dfs(startIndex: Int){
        if(current in uniquNum) return
        uniquNum.add(current)
  //      println(current)

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
