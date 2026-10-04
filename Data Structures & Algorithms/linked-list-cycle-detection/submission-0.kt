/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    val set = hashSetOf<ListNode>()
    fun hasCycle(head: ListNode?): Boolean {
    if(head == null) return false

    if (head.next != null){

        if(head in set) return true
        set.add(head)

        return hasCycle(head.next)
    }

    return false
}
}
