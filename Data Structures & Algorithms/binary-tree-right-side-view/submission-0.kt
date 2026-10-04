/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    val result = mutableListOf<MutableList<Int>>()

    fun rightSideView(root: TreeNode?): List<Int> {
        val a = fillResult(root)
        print(result)
        return result.map{
            it.last()
        }
    }

    fun fillResult(
            root: TreeNode?, 
            deep: Int = 0
        ) {

        if(root == null) return

        val list = result.getOrNull(deep)

        if(list == null){
            result.add(deep, mutableListOf<Int>(root.`val`))
        }else{
            result[deep].add(root.`val`)
        }

        fillResult(root.left, deep + 1)
        fillResult(root.right, deep + 1)
    }
}
