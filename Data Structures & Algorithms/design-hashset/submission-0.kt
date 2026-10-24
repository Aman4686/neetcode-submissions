class MyHashSet() {
    val arr = mutableListOf<Int>()

    fun add(key: Int) {
        if(key in arr) return
        arr.add(key)
    }

    fun remove(key: Int) {
        arr.remove(key)
    }

    fun contains(key: Int): Boolean {
        val contain = key in arr
        return contain
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
