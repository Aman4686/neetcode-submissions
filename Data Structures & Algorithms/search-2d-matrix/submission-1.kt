class Solution {
 fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    
    var left = 0
    var right = -1
    
    
    for (arr in matrix){
        right = arr.size - 1
        
        while (left <= right){
            val mid = left + (right - left) / 2
            
            when{
                mid == target -> return true
                mid > target -> right = mid - 1
                else -> left = mid + 1
            }
            
        }
        
        
        
    }
    
    return false
}
}
