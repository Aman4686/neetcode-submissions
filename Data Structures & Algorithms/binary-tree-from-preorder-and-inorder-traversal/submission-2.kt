/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
    if(inorder.isEmpty()) return null
    if(inorder.size == 1) return TreeNode(inorder[0])
    if(preorder.isEmpty()) return null
    val rootValue = preorder[0]
    val root = TreeNode(preorder[0])

    val rootLeft = preorder.sliceArray(1 until preorder.size)
    val rootRight = preorder.sliceArray(2 until preorder.size)
    //preorder = [9,20,15,7], inorder = [9,3,15,20,7]
    val mid = inorder.indexOf(rootValue)

    val leftSide = inorder.sliceArray(0 until  mid)
    //preorder = [9,20,15,7], inorder = [9]
    root.left = buildTree(rootLeft, leftSide)

    val rightSide = inorder.sliceArray(mid + 1 until  inorder.size)
    //preorder = [20,15,7], inorder = [15,20,7]
    // left = [15,7] inorder = [15]
    // right = [7] inorder = [7]
    root.right = buildTree(rootRight, rightSide)

    return root
}
}
