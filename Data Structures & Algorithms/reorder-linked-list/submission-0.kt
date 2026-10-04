/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
    if(head == null) return
    val list = mutableListOf<ListNode?>()

    var tempHead = head
    while (tempHead != null){
        list.add(tempHead)
        tempHead = tempHead.next
    }

    var left = 0
    var right = list.size - 1
    val mid = ceil((left + (right - left) / 2.0)).toInt()


    while (left < right){
        val leftNode = list[left]
        val rightNode = list[right]

        rightNode?.next = leftNode?.next
        leftNode?.next = rightNode

        right--
        left++
    }
    list[mid]?.next = null

}
}
