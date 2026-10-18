/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun isValidBST(root: TreeNode?): Boolean {
    if(root == null) return true

    val leftValue = root.left?.`val` ?: Int.MIN_VALUE
    if(leftValue > root.`val` ){
        return false
    }
    
    val rightValue = root.right?.`val` ?: Int.MAX_VALUE
    if(rightValue < root.`val` ){
        return false
    }

    return isValidBST(root.left) && isValidBST(root.right)
}
}
