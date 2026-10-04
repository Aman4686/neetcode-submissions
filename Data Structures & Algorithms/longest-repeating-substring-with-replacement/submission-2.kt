class Solution {
  fun characterReplacement(s: String, k: Int): Int {
    val uniqueCharset = s.toSet()

    var result = Int.MIN_VALUE
    for(uniqueChar in uniqueCharset) {
        
        var swaps = k
        var left = 0
       // println("====== ${uniqueChar} ======")
        for (right in s.indices) {
            val char = s[right]
            val isSwapAvailable = swaps > 0
          //  println(s.substring(left, right + 1))
            if (char != uniqueChar) {
                if (isSwapAvailable) {
                    swaps--
                    
                }else {

                while (true) {
                    if (s[left] == uniqueChar) {
                        left++
                       // println("-     ${s.substring(left, right + 1)}")
                    } else {
                        left++
                       // println("break ${s.substring(left, right + 1)}")
                        break
                    }
                }
                }
            }

            val temp = (right - left) + 1
            if(temp > result){
                result = temp
            }

        }
    }


    return result

}
}
