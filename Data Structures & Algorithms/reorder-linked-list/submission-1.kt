/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
    if(head == null) return
    // Find middle with slow fast pointer
    var slow = head
    var fast = head
    while(fast != null && fast.next != null){
        slow = slow?.next
        fast = fast.next?.next
    }
    // Reverse second part
    var newNode = slow?.next
    var prevNode: ListNode? = null

    while (newNode != null){
        val save = newNode.next
        newNode.next = prevNode
        prevNode = newNode
        newNode = save
    }

    slow?.next = null

    // Merge second part

    var saveHead = head
    var saveReverse = prevNode
    var counter = 0
    while (saveReverse != null){
        // println(saveHead)
        // println(saveReverse)

        val temp = saveHead?.next // 1
        saveHead?.next = saveReverse // 0 -> 7
        saveHead = temp // 0 = 1
        val temp1 = saveReverse.next // 7 = 6
        saveReverse.next = temp
        saveReverse = temp1
        counter++
    }

    //printListNode(head)

}
}
