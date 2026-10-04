class MinStack() {

    val arrDeque = ArrayDeque<Int>()
    val pq = java.util.PriorityQueue<Int>()

    var lastPushValue: Int? = null

    fun push(`val`: Int) {
        arrDeque.add(`val`)
        pq.add(`val`)

        lastPushValue = `val`
    }

    fun pop() {
        arrDeque.removeLast()
        pq.remove(lastPushValue)
        lastPushValue = arrDeque.lastOrNull()

    }


    fun top(): Int {
        return arrDeque.last()
    }

    fun getMin(): Int {
        return pq.peek()
    }
}
