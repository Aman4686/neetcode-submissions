/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
  fun insertIntoBST(root: TreeNode?, value: Int): TreeNode? {
    if(root == null) return TreeNode(value)
    
   insertIntoBST1(root, value)

    return root
}

fun insertIntoBST1(root: TreeNode?, value: Int): TreeNode? {
    if(root == null) return null



    if(root.`val` > value){
        if(root.left == null) {
            root.left = TreeNode(value)
            return root
        }

        insertIntoBST(root.left, value)
    }else{
        if(root.right == null) {
            root.right = TreeNode(value)
            return root
        }

        insertIntoBST(root.right, value)
    }

    return root
}
}
