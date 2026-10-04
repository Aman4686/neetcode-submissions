class Solution {
fun isValid(s: String): Boolean {
    val arr = ArrayDeque<Char>()
    val closeBrackets = setOf<Char>(')' , ']', '}')

    if(s.isEmpty()) return false
    if(s.length == 1) return false
    //val map = hashMapOf(')' to '(', ']' to '[', '}' to '{')
    val map = hashMapOf('(' to ')', '[' to ']', '{' to '}')

    for (bracket in s){
        val isClose = closeBrackets.contains(bracket)
        val isOpen = map.contains(bracket)

        when{
            isOpen -> arr.addLast(bracket)
            isClose -> {
                if(arr.isEmpty()) return false

                val closeBreaket = map.get(arr.last())
                if(bracket == closeBreaket){
                    arr.removeLast()
                }else{
                    return false
                }
            }
        }
    }


    return arr.isEmpty()
}
}