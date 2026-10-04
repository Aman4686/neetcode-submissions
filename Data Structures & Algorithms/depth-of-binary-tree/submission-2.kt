/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
//    fun maxDepth(root: TreeNode?): Int {
//     if(root == null) return 0
//     val arr = ArrayDeque<Pair<TreeNode?, Int>>()
   
//     arr.add(root to 1)

//     var result = 0
//     while(arr.isNotEmpty()){
//         val root = arr.removeFirst()
//             val node = root.first
//             val counter = root.second

//             if(node != null) {
//                 if (node.right != null) {
//                     arr.add(node.right to (counter + 1))
//                 }

//                 if (node.left != null) {
//                     arr.add(node.left to (counter + 1))
//                 }
//             }
//         result = max(result, counter)
//     }

//     return result
// }

fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    val left = maxDepth(root.left)
    val right = maxDepth(root.right)
//    result = max(left, right)

    return 1 + max(left, right)
}

}
