/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
   fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    if(list1 == null) return list2
    if(list2 == null) return list1


    return if(list1.`val` <= list2.`val`){
        list1.next = mergeTwoLists(saveFirst, list2)
        list1
    }else{
        list2.next = mergeTwoLists(list1, saveSecond)
        list2
    }
}
}
