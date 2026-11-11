class Solution {
    val targetX = 0.0
val targetY = 0.0

fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
    val heap = PriorityQueue<IntArray>(compareBy {
        distance(it[0].toDouble(), it[1].toDouble(), targetX, targetY)
    })

    for(p in points){
        heap.add(p)
    }

    val result = Array(k) { intArrayOf() }

    repeat(k) {
        result[it] = heap.poll()
        println(result[it].toList())
    }

    return result
}

fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val dx = x1 - x2
    val dy = y1 - y2
    return sqrt(dx * dx + dy * dy)
}
}
