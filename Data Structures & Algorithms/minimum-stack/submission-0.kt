class MinStack() {

    val arr = ArrayDeque<Int>()
    val sortedSet = sortedSetOf<Int>()
    var lastValue: Int? = null
    
    fun push(`val`: Int) {
        arr.add(`val`)
        lastValue = `val`
    }

    fun pop() {
        arr.removeLast()
        sortedSet.removeIf { lastValue != null }
    }
        

    fun top(): Int {
        return arr.last()
    }

    fun getMin(): Int {
        return sortedSet.first()
    }
}
