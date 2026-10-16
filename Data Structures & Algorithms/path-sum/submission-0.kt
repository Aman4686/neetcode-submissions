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
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if(root == null) return false
      if(root.left == null && root.right == null) {
        return root.`val` == targetSum
    }


    val firstSum = root.`val`
    return dfs(root = root.left, sum = firstSum, targetSum = targetSum) ||
    dfs(root = root.right, sum = firstSum, targetSum = targetSum)
}



fun dfs(root: TreeNode?, sum: Int, targetSum: Int): Boolean{
    if(root == null) {
        return false
    }
    val maxSum = sum + root.`val`
    
    if(root.right == null && root.left == null){
        if(targetSum == maxSum){
            return true
        }
    }

    return dfs(root.left, maxSum, targetSum) ||
    dfs(root.right, maxSum, targetSum)
}

}