class Solution {
fun searchMatrix(matrix: Array<IntArray> = arrayOf(
    intArrayOf(1, 2, 4, 8),
    intArrayOf(10, 11, 12, 13),
    intArrayOf(14, 20, 30, 40)
), target: Int = 10): Boolean {

    var left = 0
    var row = matrix.size
    var col = matrix[0].size
    var right = (row * col) - 1

        while (left <= right){
            val mid = left + (right - left) / 2
            val value = matrix[mid / col][mid % col]
            when{
                value == target -> return true
                value > target -> right = mid - 1
                else -> left = mid + 1
            }

        }

    return false
}
}
