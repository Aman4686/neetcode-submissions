class Solution {
fun longestConsecutive(nums: IntArray): Int {
    val result = mutableSetOf<Int>()
    val sortedSet = nums.toSortedSet()

    var count = 1
    for(num in sortedSet){

        if(sortedSet.contains(num + 1)){
            count++
        }else{
            result.add(count)
            count = 1
        }
        println(count)
    }
    if(result.isEmpty()) return 0


    return result.toSortedSet().last()
}
}
