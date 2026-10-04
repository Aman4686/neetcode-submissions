/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return root
    
    val leftNode = root.left
    val rightNode = root.right
    root.right = leftNode
    root.left = rightNode

    invertTree(leftNode)
    invertTree(rightNode)
    
    return root
}

}
