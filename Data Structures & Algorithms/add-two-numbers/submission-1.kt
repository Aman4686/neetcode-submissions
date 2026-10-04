/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
   fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null) return l1
    if(l2 == null) return l1

    if(l1.`val` + l2.`val` == 0) return ListNode(0)

    var l1Node = l1
    var l2Node = l2

    var firstNewNode : ListNode? = null
    var nextNewNode: ListNode? = null

    var savedNum = 0

    while (true) {
        val result = (l1Node?.`val` ?:0) + (l2Node?.`val`?:0) + savedNum
        if(result <= 0) break

        println(result)

        val newValue = if(result > 9){
            savedNum = 1
            result.toString().last().digitToInt()
        }else{
            savedNum = 0
            result
        }

        val newNode = ListNode(newValue)

        if (firstNewNode == null) {
            firstNewNode = newNode
            nextNewNode = newNode
        }else{
            nextNewNode?.next = newNode
            nextNewNode = newNode
        }

        l1Node = l1Node?.next
        l2Node = l2Node?.next
    }
    return firstNewNode

}
}
