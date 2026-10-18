class Solution {
    fun validPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        var oneTimeSkip = true
        while(left <= right){
            val leftChar = s[left]
            val rightChar = s[right]

            if(leftChar != rightChar){
                val leftCharNext = s[left + 1]
                val rightCharNext = s[right - 1]

                if(!oneTimeSkip) return false

                if(leftChar == rightCharNext){
                    right--
                    oneTimeSkip = false
                    continue
                }else if (rightChar == leftCharNext){
                    left++
                     oneTimeSkip = false
                    continue
                }

                return false
            }else{
                left++
                right--
            }
        }

        return true
    }
}


        // val array = IntArray(2)

        // while(left <= right){
        //     val leftChar = s[left]
        //     val rightChar = s[right]

        //     if(leftChar != rightChar){
        //         array[0] = left
        //         array[1] = right
        //         break
        //     }else{
        //         left++
        //         right--
        //     }
        // }
