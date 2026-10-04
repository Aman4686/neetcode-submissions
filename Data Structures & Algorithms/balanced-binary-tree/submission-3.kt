/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    
var result = true
fun maxDepth(root: TreeNode?): Int{
    if(root == null) return 0

    val left = maxDepth(root.left)
    val right = maxDepth(root.right)
   // println(left)
   // println(right)
    if(result) {
        result = abs(left - right) < 2
    }
    return 1 + max(left, right)
}

fun isBalanced(root: TreeNode?): Boolean {
    if(root == null) return true
    maxDepth(root)

    return result
}
}
