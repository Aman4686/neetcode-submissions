class Solution {
  fun longestConsecutive(nums: IntArray): Int {
    if(nums.isEmpty()) return 0
    
    val sortedSet = nums.toSortedSet()
    var temp = sortedSet.first()
    var count = 1
    for(it in 0 until sortedSet.size) {
        if(it - temp == 1){
            temp = it
            count++
        }
    }
    println(count)
    return count
}
}
