/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var result = false
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(subRoot == null) return true

    val arr = kotlin.collections.ArrayDeque<TreeNode?>()

    arr.add(root)

    while (arr.isNotEmpty()){
        val node = arr.removeFirst()

        if(node != null){

            if(node.`val` == subRoot.`val`){
                if(!result){
                    result = isTreeSame(node, subRoot)
                }
            }

            arr.add(node?.left)
            arr.add(node?.right)
        }
    }

    return result
}


fun isTreeSame(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(subRoot == null) return true

    val arr = kotlin.collections.ArrayDeque<TreeNode?>()

    arr.add(root)
    arr.add(subRoot)

    while (arr.isNotEmpty()){
        val node1 = arr.removeFirst()
        val node2 = arr.removeFirst()
        if ((node1 == null) != (node2 == null)) return false

        if(node1 != null && node2 != null) {
            if (node1.`val` != node2.`val`) return false

            arr.add(node1.left)
            arr.add(node2.left)
            arr.add(node1.right)
            arr.add(node2.right)
        }

    }

    return true
}
}
//var result = false
//
//fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
//    if(root == null) return result
//
//    if(root.value == subRoot?.value) {
//        if (!result) {
//            result = isTreeSame(root, subRoot)
//        }
//    }
//
//    iterateTree(root.left, subRoot)
//    iterateTree(root.right, subRoot)
//
//    return result
//}
//
//fun iterateTree(root: TreeNode?, subRoot: TreeNode?){
//    if(root == null) return
//
//    if(root.value == subRoot?.value) {
//        if (!result) {
//            result = isTreeSame(root, subRoot)
//        }
//    }
//
//    iterateTree(root.left, subRoot)
//    iterateTree(root.right, subRoot)
//}
//
//fun isTreeSame(root: TreeNode?, subRoot: TreeNode?): Boolean {
//    if(root == null && subRoot == null) return true
//
//    if(root != null && subRoot != null && root.value == subRoot.value)
//        return isTreeSame(root.left, subRoot.left) && isTreeSame(root.right, subRoot.right)
//
//    return false
//}

