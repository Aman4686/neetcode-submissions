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
    if(root == null) return result

    if(root.`val` == subRoot?.`val`) {
        if (!result) {
            result = isTreeSame(root, subRoot)
        }
    }

    iterateTree(root.left, subRoot)
    iterateTree(root.right, subRoot)

    return result
}

fun iterateTree(root: TreeNode?, subRoot: TreeNode?){
    if(root == null) return

    if(root.`val` == subRoot?.`val`) {
        if (!result) {
            result = isTreeSame(root, subRoot)
        }
    }

    iterateTree(root.left, subRoot)
    iterateTree(root.right, subRoot)
}

fun isTreeSame(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if(root == null && subRoot == null) return true

    if(root != null && subRoot != null && root.`val` == subRoot.`val`)
        return isTreeSame(root.left, subRoot.left) && isTreeSame(root.right, subRoot.right)

    return false
}
}
