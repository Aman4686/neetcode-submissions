class Solution {
   
fun lastStoneWeight(stones: IntArray): Int {
    val queue = PriorityQueue<Int>(compareByDescending { it }).apply {
        addAll(stones.toList())
    }

    while (queue.size > 1){
        val first = queue.poll()
        val second = queue.poll()

        if(first == second) continue

        val result = max(first, second) - min(first, second)

        queue.add(result)
    }

    return if(queue.isEmpty()) 0 else queue.peek()
}
}
