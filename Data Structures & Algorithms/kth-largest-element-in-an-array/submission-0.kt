class Solution {
 fun findKthLargest(nums: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>(compareByDescending { it })
    
    for(num in nums){
        heap.add(num)
    }
    
    var result = 0
    
    repeat(k){
        result = heap.poll()
    }
    
    return result
    
}
}
