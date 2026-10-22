class Solution {

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val current = mutableListOf<Int>()

    fun dfs(uniqueNums: HashSet<Int>){
        println(current)
        if(current.size == nums.size){
            result.add(current.toList())
        }

        for(num in uniqueNums){
            current.add(num)

            val newSet = uniqueNums.toHashSet()
            newSet.remove(num)
            dfs(newSet)

            current.removeLast()
        }

    }

    dfs(nums.toHashSet())


    return result
}


//   fun permute(nums: IntArray): List<List<Int>> {
//     val result = mutableListOf<Set<Int>>()
//     val current = mutableListOf<Int>()

//     fun dfs(){
//         println(current)
//         if(current.size == nums.size){
//             result.add(current.toSet())
//             return
//         }

//         for(num in nums){

//             current.add(num)
//             dfs()
//             current.removeLast()
//         }

//     }

//     dfs()


//     return result.map{ it.toList() }.filter{ it.size == 3}
// }
}
