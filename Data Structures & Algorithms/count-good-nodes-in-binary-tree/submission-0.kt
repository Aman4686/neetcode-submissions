/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
fun goodNodes(root: TreeNode?): Int {
    if(root == null) return 0

    DFS(root, root.`val`)
    return counter
}

var counter = 1
fun DFS(root: TreeNode?, maxValue: Int){
    if(root == null) return

    val leftValue = root.left?.`val` ?: Int.MIN_VALUE
    val rightValue = root.right?.`val` ?: Int.MIN_VALUE
    
  val maxLeft = maxOf(leftValue, maxValue)
    val maxRight = maxOf(rightValue, maxValue)
    
     if(maxLeft <= leftValue) {
        counter++
    }

    if(maxRight <= rightValue) {
        counter++
    }


    DFS(root.left, maxLeft)
    DFS(root.right, maxRight)

}

}