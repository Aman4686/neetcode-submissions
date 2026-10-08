class MyStack() {
    
    val arr = ArrayDeque<Int>()
    
    fun push(x: Int) {
        arr.addLast(x)
    }

    fun pop(): Int {
        return arr.removeLast()
    }

    fun top(): Int {
        return arr.last()
    }

    fun empty(): Boolean {
        return arr.size <= 0
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
