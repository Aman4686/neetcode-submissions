class PrefixTree {

    class PrefixTreeNode(
        val map: MutableMap<Char, PrefixTreeNode> = mutableMapOf(),
        var isEnd: Boolean = false
    )


    val root = PrefixTreeNode()

    fun insert(word: String) {
        val lastIndex = word.length - 1
        var tempRoot = root

        for(i in 0 until word.length){
            val isLastItem = lastIndex == i
            val char = word[i]

            val nextNode = tempRoot.map[char] ?: PrefixTreeNode()
           if(isLastItem){
                nextNode.isEnd = true
            }

            tempRoot.map[char] = nextNode
            tempRoot = nextNode
        }
    }

    fun search(word: String): Boolean {
        var tempRoot = root
        val lastIndex = word.length - 1
        for(i in 0 until word.length){

            val char = word[i]

            if(!tempRoot.map.contains(char)){
                return false
            }
            val nextNode = tempRoot.map[char] ?: return false
        
            if(nextNode.isEnd && i == lastIndex) return true

            tempRoot = nextNode
        }


        return false
    }

    fun startsWith(prefix: String): Boolean {
        var tempRoot = root

        for(i in 0 until prefix.length){

            val char = prefix[i]

            if(!tempRoot.map.contains(char)){
                return false
            }
            val nextNode = tempRoot.map[char] ?: return false

            tempRoot = nextNode
        }


        return true
    }

}