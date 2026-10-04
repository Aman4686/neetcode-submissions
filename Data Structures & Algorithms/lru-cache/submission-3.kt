class LRUCache(val capacity: Int) {

    var head: Node? = null
    var tail: Node? = null

    val hashMap = HashMap<Int,Node>(capacity)

 fun get(key: Int): Int {
        synchronized(this) {
        val current = hashMap.get(key) ?: return -1
        if (current == head) return current.value

        updateNewNode(current)
            return current.value
        }
    }

    fun put(key: Int, value: Int) {
        synchronized(this) {
            val current = hashMap[key]
            if (current == null) {
                putNewNode(key, value)
                return
            }

            current.value = value
            if (current == head) return
            updateNewNode(current)
        }
    }

    fun putNewNode(key: Int, value: Int){
        val new = Node(key, value)
        hashMap[key] = new
        head?.prev = new
        new.next = head
        head = new

        if(tail == null) tail = new

        if(hashMap.size > capacity){
            removeTail()
        }
    }

    fun removeTail() {
        val newTail = tail?.prev
        newTail?.next = null
        hashMap.remove(tail?.key)
        tail = newTail
    }

    fun updateNewNode(current: Node){
        val tempNext = current.next
        val tempPrev = current.prev

        current.prev?.next = tempNext
        current.next?.prev = tempPrev

        head?.prev = current
        current.next = head
        current.prev = null

        head = current

        if(current == tail) tail = tempPrev
    }

    class Node(
        var key: Int,
        var value: Int
    ){
        var next: Node? = null
        var prev: Node? = null

        // override fun toString(): String {
        //     return "Node { \n" +
        //             "prev = ${prev?.key} \n" +
        //             "key ${key} \n" +
        //             "next -> ${next?.key} \n" +
        //             "} \n"
        // }
    }

    // override fun toString(): String {
    //     var result = "HEAD ${head}  \n"

    //     for(entry in hashMap.entries){
    //         if(entry.value == head || entry.value == tail){
    //             continue
    //         }

    //         result += "${entry.value} \n"
    //     }
    //     result += "TAIL ${tail} \n"
    //     return result

    // }
}