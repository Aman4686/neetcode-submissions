class Solution {
  fun calPoints(operations: Array<String>): Int {
    val result = kotlin.collections.ArrayDeque<Int>()

    val charArr = operations.map { it.toCharArray()[0] }

    for(operation in charArr){
        when{
            operation.isDigit() -> {
                result.addLast(operation.digitToInt())
            }
            operation == '+' -> {
                if(result.size < 2) break

                val prev = result[result.size - 2]
                val cur = result.last()

                result.add(prev + cur)
            }
            operation == 'C' -> {
                result.removeLast()
            }
            operation == 'D' -> {
                result.add(result.last() * 2)
            }
        }
    }

    return result.sum()
}
}
