class Solution {
fun generateParenthesis(n: Int): List<String> {
    val result = mutableListOf<String>()
    val current = StringBuilder()
    val arr = ArrayDeque<Char>()


    fun dfs() {
        val chars = charArrayOf('(', ')')
        for (char in chars) {
            if (current.length == n * 2) {
                for(char in current.toString()){
                    if(char == '(') {
                        arr.add('(')}
                    else if(arr.isNotEmpty() && char == ')' && arr.last() == '('){
                        arr.removeLast()
                    }else{
                        arr.add(')')
                    }
                }

                if(arr.isEmpty()){
                    result.add(current.toString())
                }else{
                    arr.clear()
                }

                return
            }
            current.append(char)
            dfs()
            current.deleteAt(current.lastIndex)

        }
    }

    dfs()


    return result
}
    
}
