class Solution {
  fun evalRPN(tokens: Array<String> = arrayOf("1","2","+","3","*","4","-")): Int {
    val stack = ArrayDeque<Int>()

    val operators = setOf("+", "-", "*", "/")


    for (token in tokens){
        println(token)
        if(token !in operators) {
            stack.add(token.toInt())
            continue
        }else{
            val first = stack.first()
            val last = stack.last()
            val result = when(token) {
                "+" -> {
                    first + last
                }
                "-" -> {
                    first - last
                }
                "*" -> {
                    first * last
                }
                "/" -> {
                    first / last
                }else -> {
                    0
                }
            }
            stack.clear()
            stack.add(result)
        }
    }
    return stack.last()
}
}
