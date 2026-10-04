/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    while (fast != null && fast?.next != null){
        slow = slow?.next
        fast = fast?.next?.next
        if(slow == fast) return true
    }

    return false
}

//     val set = hashSetOf<ListNode>()
//     fun hasCycle(head: ListNode?): Boolean {
//     if(head == null) return false

//     if (head.next != null){

//         if(head in set) return true
//         set.add(head)

//         return hasCycle(head.next)
//     }

//     return false
// }
}
