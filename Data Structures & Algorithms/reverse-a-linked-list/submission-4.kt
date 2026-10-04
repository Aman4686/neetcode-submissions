/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {


    fun reverseList(head: ListNode?): ListNode? {
       var prev : ListNode? = null
       var curr : ListNode? = head
        while (curr != null){
            var newHead = curr?.next
            curr?.next = prev
            prev = curr
            curr = newHead
        }

    return prev
}
}
