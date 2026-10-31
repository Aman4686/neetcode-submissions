class Solution {
    fun letterCombinations(digits: String): List<String> {

        if(digits.isEmpty()) return emptyList()

    val hashMap = hashMapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz",
    )
    val current = StringBuilder()
    val result = mutableListOf<String>()

    fun dfs(arrIndex: Int) {

        if(current.length == digits.length){
            result.add(current.toString())
            return
        }

        val charsArray = hashMap.get(digits[arrIndex]) ?: return

        for(i in 0 until charsArray.length){
            current.append(charsArray[i])
            dfs(arrIndex + 1)
            current.deleteAt(current.lastIndex)
        }


    }
    dfs(0)

    return result
}

}
