/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val reverbList = reverseList(head)
    val listWithoutNode = removeNode(reverbList, n)
    return reverseList(listWithoutNode)
}

fun removeNode(head: ListNode?, num: Int): ListNode?{
    if(num == 1){
        val result = head?.next
        head?.next = null
        return result
    }

    var prevNode: ListNode? = head
    var target = head?.next

    for(i in 1..num-1){

        if(i == num-1){
            println(prevNode)
            println(target)

            prevNode?.next = target?.next
           break
        }
        prevNode = target
        target = target?.next
    }

    return head
}


fun reverseList(head: ListNode?): ListNode? {
    var prevNode: ListNode? = null
    var newNode = head
    while (newNode != null){
        val save = newNode.next
        newNode.next = prevNode
        prevNode = newNode
        newNode = save
    }
    return prevNode
}
}
