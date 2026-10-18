/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun reverseList(head: ListNode?): ListNode? {
    if(head?.next == null) return head
    val nextNode = head.next
    if(prev != null){
        head.next = prev
    }
    prev = head.next

    return reverseList(nextNode)
}
}
