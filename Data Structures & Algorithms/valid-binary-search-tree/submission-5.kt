/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
 fun isValidBST(root: TreeNode?, low: Int = Int.MIN_VALUE, high: Int = Int.MAX_VALUE): Boolean {
    if(root == null) return true
    if(root.`val` <= low || root.`val` >= high) return false
    
    return isValidBST(root.left, low = low, high = root.`val`)
            && isValidBST(root.right, low = root.`val`, high = high)
}
}
