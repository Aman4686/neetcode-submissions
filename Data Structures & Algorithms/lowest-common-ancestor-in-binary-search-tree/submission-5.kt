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

    if(root.left == p && root.right == q || root.left == q && root.right == p) return root
    if(root.left == p && root.right != q || root.right == p && root.left != q) return p
    if(root.left == p || root.right == p || root.right == q || root.left == q) return root
    
    lowestCommonAncestor(root.left, p, q)
    lowestCommonAncestor(root.right, p, q)

    return result
}
}
