class Solution {
fun combine(n: Int, k: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val current = mutableListOf<Int>()

    fun dfs(start: Int){
        if(current.size == k){
            result.add(current.toList())
            return
        }

        for(i in start .. n){
            current.add(i)
            dfs(i + 1)
            current.removeLast()
        }

    }

    dfs(1)
    return result
}
}
