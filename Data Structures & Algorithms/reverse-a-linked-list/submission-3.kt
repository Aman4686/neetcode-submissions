/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
var prev : ListNode? = null

fun reverseList(head: ListNode?): ListNode? {
    val nextNode = head?.next
    head?.next = prev
    prev = nextNode

    return head
}
}
