class Solution {
   fun permuteUnique(nums: IntArray): List<List<Int>> {
    val current = mutableListOf<Int>()
    val result = hashSetOf<List<Int>>()

    val boolArr = BooleanArray(nums.size)

    fun dfs() {
        if(current.size == nums.size){
            result.add(current.toList())
            return
        }

        for(i in 0 until nums.size){
            if(boolArr[i]) continue

            boolArr[i] = true
            current.add(nums[i])
            dfs()
            boolArr[i] = false
            current.removeLast()

        }

    }

    dfs()
    return result.toList()
}
}
