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
    if(p == null || q == null) return result

    if(isTreeContainNode(root, p) && isTreeContainNode(root, q)) {
        result = root
    }

    if(p.`val` < root.`val` && q.`val` < root.`val`){
        lowestCommonAncestor(root.left, p, q)
    }else{
        lowestCommonAncestor(root.right, p, q)
    }

    return result
}

fun isTreeContainNode(root: TreeNode?, find: TreeNode?): Boolean{
    if(root == null) return false
    if(find == null) return false
    if(root == find) return true

     return if(find.`val` < root.`val`){
         isTreeContainNode(root.left, find)
    }else{
         isTreeContainNode(root.right, find)
    }
}

}
