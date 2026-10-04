/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if(p == null && q == null) return true
    if(p?.`val` != q?.`val`) return false

    val arr = kotlin.collections.ArrayDeque<TreeNode?>()
    arr.add(p)
    arr.add(q)

    while (arr.isNotEmpty()){

        val node1 = arr.removeFirst()
        val node2 = arr.removeFirst()
        if(node1 == null && node2 == null) continue
        if(node1?.`val` != node2?.`val`) return false


        println("node1 ${node1?.`val`}")
        println("node2 ${node2?.`val`}")

        arr.add(node1?.left)
        arr.add(node2?.left)
        arr.add(node1?.right)
        arr.add(node2?.right)

    }


    return true
}
}
