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
    // preorder = [3,1,2,4] inorder = [1,2,3,4]

    val mid = inorder.indexOf(rootValue)
    val leftSideInorder = inorder.sliceArray(0 until  mid)
    val rightSideInorder = inorder.sliceArray(mid + 1 until  inorder.size)
    // rightEdge = 3

    val rootLeftPreorder = preorder.slice(1 until mid + 1)
    val rootRightPreorder = preorder.slice(mid + 1 until preorder.size)

    // rootRightPreorder = []
    root.left = buildTree(rootLeftPreorder.toIntArray(), leftSideInorder)

    root.right = buildTree(rootRightPreorder.toIntArray(), rightSideInorder)

    return root
}
}
