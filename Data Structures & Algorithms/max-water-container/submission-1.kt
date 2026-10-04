class Solution {
    fun maxArea(heights: IntArray): Int {

    var left = 0
    var right = heights.size - 1
    var result = -1

    while (left < right){

        val leftHeight = heights[left]
        val rightHeight = heights[right]
        val size = right - left
        val container = min(leftHeight, rightHeight) * size

        if(container > result){
            result = container
        }

        when{
            leftHeight > rightHeight -> right--
            else -> {
                left++
            }
        }
    }
    return result
}
}
