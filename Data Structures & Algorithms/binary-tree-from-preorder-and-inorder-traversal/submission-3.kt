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
    // rootValue = 3 midIndex = 2
    val leftSideInorder = inorder.sliceArray(0 until  mid)
    // leftSideInorder = [1,2]
    val rightSideInorder = inorder.sliceArray(mid + 1 until  inorder.size)
    // rightSideInorder = [4]

    val rightEdge = preorder.indexOf(rightSideInorder[0])
    // rightEdge = 3

    val rootLeftPreorder = preorder.sliceArray(1 until rightEdge)
    // rootLeftPreorder = [3,1,2]
    val rootRightPreorder = preorder.sliceArray(rightEdge  until preorder.size)
    // rootRightPreorder = []
    root.left = buildTree(rootLeftPreorder, leftSideInorder)

    root.right = buildTree(rootRightPreorder, rightSideInorder)

    return root
}
}
