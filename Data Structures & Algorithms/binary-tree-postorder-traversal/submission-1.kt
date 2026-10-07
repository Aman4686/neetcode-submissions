/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


    

    class Solution {
       val list = mutableListOf<Int>()

    fun postorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return list
        preorder(root)

        return list
    }

    fun preorder(root: TreeNode?) {
        if(root == null) return
        preorder(root.left)
        preorder(root.right)
        list.add(root.`val`)
    }

}
