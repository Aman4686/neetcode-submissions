class NumMatrix(val matrix: Array<IntArray>) {

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var result = 0
        for(x in row1 .. row2){
            for(y in col1  ..  col2){


                val num = matrix[x][y]
                result += num

            }
        }

        return result
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
