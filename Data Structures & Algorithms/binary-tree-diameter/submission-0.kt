/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   var result = 0
fun diameterOfBinaryTree(root: TreeNode?): Int {
    maxDepth(root)
    return result
}

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    val left = maxDepth(root.left)
    val right = maxDepth(root.right)
    result = max(result, left + right)

    return 1 + max(left , right)
}



}
