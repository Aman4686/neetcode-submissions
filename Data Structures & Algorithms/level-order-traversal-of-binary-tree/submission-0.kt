/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
   fun levelOrder(root: TreeNode?): List<List<Int>> {
    visit(root)
    return result
}
val result = mutableListOf<MutableList<Int>>()
fun visit(root: TreeNode?, count: Int = 0){
    if(root == null) return
 
    val innerList = result.getOrNull(count)
    if(innerList == null){
        result.add(count, mutableListOf(root.`val`))
    }else{
        result[count].add(root.`val`)
    }

    visit(root.left, count+1)
    visit(root.right, count+1)
}
}
