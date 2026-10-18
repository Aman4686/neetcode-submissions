class MinStack() {

    val arr = ArrayDeque<Int>()
    val sortedSet = sortedSetOf<Int>()
    var lastValue: Int? = null
    
    fun push(`val`: Int) {
        arr.add(`val`)
        sortedSet.add(`val`)
        lastValue = `val`
    }

    fun pop() {
        arr.removeLast()
        if(lastValue != null){
            sortedSet.remove(lastValue)
        }
    }
        

    fun top(): Int {
        return arr.last()
    }

    fun getMin(): Int {
        println(sortedSet.size)
        return sortedSet.first()
    }
}
