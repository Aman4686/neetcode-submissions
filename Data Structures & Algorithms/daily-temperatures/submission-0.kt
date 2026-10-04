class Solution {
   fun dailyTemperatures(temperatures: IntArray = intArrayOf(30,38,30,36,35,40,28)): IntArray {

    // find element that grater than my number and less then next number
    // if next number index is last

    val result = IntArray(temperatures.size)

    for (i in 0 until temperatures.size){
        val primary = temperatures[i]


        for(j in i until temperatures.size){
            val secondary = temperatures[j]

            if(primary < secondary) {
                result[i] = j - i
                break
            }
        }
    }

    return result
}
}
