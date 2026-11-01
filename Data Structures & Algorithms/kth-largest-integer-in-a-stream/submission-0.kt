class KthLargest(val k: Int, nums: IntArray) {
    val arr = PriorityQueue<Int>()

    init {
        arr.addAll(nums.toList())
        while(arr.size > k){
            arr.poll()
        }
    }

    fun add(value: Int): Int {
        arr.poll()
        arr.add(value)
        return arr.peek()
    }
}
