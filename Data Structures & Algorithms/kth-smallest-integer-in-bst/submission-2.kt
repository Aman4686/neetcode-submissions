/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var queue = mutableListOf<Int>()
fun kthSmallest(root: TreeNode?, k: Int): Int {
    if(root == null) return 0
    fillQueue(root)

    return queue[k-1]
}

fun fillQueue(root: TreeNode?) {
    if(root == null) return
    fillQueue(root.left)
    queue.add(root.`val`)
    fillQueue(root.right)
}
}