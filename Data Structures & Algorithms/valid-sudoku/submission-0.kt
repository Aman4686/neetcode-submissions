class Solution {
 fun isValidSudoku(board: Array<CharArray>): Boolean {

    val columSet = Array(board.size){ mutableSetOf<Char>()}
    val boxSet = Array(board.size){ mutableSetOf<Char>()}

    for(i in 0 until board.size){
        val rowSet = mutableSetOf<Char>()

        for(j in 0 until board[i].size){
            val rowChar = board[i][j]

            val boxIndex = (i / 3) * 3 + (j / 3)
            if(boxSet[boxIndex].contains(rowChar)) return false
            if(rowChar != '.') boxSet[boxIndex].add(rowChar)

            if(columSet[j].contains(rowChar)) return false
            if(rowChar != '.') columSet[j].add(rowChar)

            if(rowSet.contains(rowChar)) return false
            if(rowChar != '.') rowSet.add(rowChar)
        }

    }

    return true

}
}
