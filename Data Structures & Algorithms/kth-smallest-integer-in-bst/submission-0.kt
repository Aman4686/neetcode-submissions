/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
  val arr = kotlin.collections.ArrayDeque<TreeNode>()

fun kthSmallest(root: TreeNode?, k: Int): Int {
    if(root == null) return 0
    arr.add(root)

    collectAllRight(root)
    collectAllLeft(root)
    
    return arr[k-1].`val`
}

fun collectAllRight(root: TreeNode?){
    if(root == null) return

    root.right?.let {
        arr.addLast(it)
    }
    collectAllRight(root.right)
}

fun collectAllLeft(root: TreeNode?){
    if(root == null) return
    root.left?.let {
        arr.addFirst(it)
    }
    collectAllLeft(root.left)
}
}
