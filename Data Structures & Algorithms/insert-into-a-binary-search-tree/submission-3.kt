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
    if(root == null) return TreeNode(value)



    if(root.`val` > value){
       
            root.left = insertIntoBST(root.left, value)
      
    
    }else{
     
            root.right =  insertIntoBST(root.right, value)
          

    
    }

    return root
}
}
