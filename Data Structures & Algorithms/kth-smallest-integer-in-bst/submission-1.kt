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
  var queue = PriorityQueue<Int>()
fun kthSmallest(root: TreeNode?, k: Int): Int {
    if(root == null) return 0
    fillQueue(root)
    for(i in 2..k){
        queue.poll()
    }

    return queue.poll()
}

fun fillQueue(root: TreeNode?) {
    if(root == null) return
    queue.add(root.`val`)
    fillQueue(root.left)
    fillQueue(root.right)
}

}