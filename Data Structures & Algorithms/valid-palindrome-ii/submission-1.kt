class Solution {
    
fun validPalindrome(s: String = "abbda"): Boolean {
    var left = 0
    var right = s.length - 1
    val array = IntArray(2)


    while (left <= right) {
        val leftChar = s[left]
        val rightChar = s[right]

        if (leftChar != rightChar) {
            array[0] = left
            array[1] = right
            break
        } else {
            left++
            right--
        }
    }
    var left1 = 0
    var right1 = s.length - 1

    val skipIndexLeft = array[0]
    var isSuccessesFirst = true
    while (left1 <= right1) {
        val leftChar = s[left1]
        val rightChar = s[right1]

        if (leftChar != rightChar) {
            if (skipIndexLeft == left1){
                left1++
                continue
            }
            isSuccessesFirst = false
            break
        } else {
            left1++
            right1--
        }
    }


    var left2 = 0
    var right2 = s.length - 1
    val skipIndexRight = array[1]
    var isSuccessesSecond = true
    while (left2 <= right2) {
        val leftChar = s[left2]
        val rightChar = s[right2]

        if (leftChar != rightChar) {
            if (skipIndexRight == right2){
                right2--
                continue
            }
            isSuccessesSecond = false
            break
        } else {
            left2++
            right2--
        }
    }




    return isSuccessesSecond || isSuccessesFirst
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
