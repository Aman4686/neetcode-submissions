/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
   fun copyRandomList(head: Node?): Node? {
    val hashMap = hashMapOf<Node?, Node?>()
   
    var temp = head
    while(temp != null){
     hashMap.put(temp, Node(temp.`val`))
        temp = temp.next
    }

    for (entry in hashMap){
        val value = entry.value
        value?.next = hashMap[entry.key?.next]
        value?.random = hashMap[entry.key?.random]
    }
    return hashMap[head]
}
}
