/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
var result: TreeNode? = null

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if(root == null) return result

    if(root.left == p || root.right == p) return root
    if(root == p) return p
    
    lowestCommonAncestor(root.left, p, q)
    lowestCommonAncestor(root.right, p, q)

    return result
}
}
