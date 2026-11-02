class KthLargest(val k: Int, nums: IntArray) {
    val arr = PriorityQueue<Int>()

    init {
        arr.addAll(nums.toList())
        while(arr.size > k){
            arr.poll()
        }
    }

    fun add(value: Int): Int {
         arr.add(value)
       if(value > arr.peek()) {
            arr.poll()
        }
        return arr.peek()
    }
}
