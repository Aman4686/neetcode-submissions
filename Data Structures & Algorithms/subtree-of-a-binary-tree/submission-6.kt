/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var result = false
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(subRoot == null) return true

    val arr = kotlin.collections.ArrayDeque<TreeNode?>()

    arr.add(root)

    while (arr.isNotEmpty()){
        val node = arr.removeFirst()

        if(node != null){

            if(node.`val` == subRoot.`val`){
                if(!result){
                    result = isTreeSame(node, subRoot)
                }
            }

            arr.add(node?.left)
            arr.add(node?.right)
        }
    }

    return result
}


fun isTreeSame(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(root == null && subRoot == null) return true

    if(root != null && subRoot != null && root.`val` == subRoot.`val`)
        return isTreeSame(root.left, subRoot.left) && isTreeSame(root.right, subRoot.right)

    return false
}
}
