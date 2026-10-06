/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


    /**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
       val list = mutableListOf<Int>()

    fun preorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return list
        preorder(root)

        return list
    }

    fun preorder(root: TreeNode?) {
        if(root == null) return
list.add(root.`val`)
        preorder(root.left)
        preorder(root.right)
    }

}
