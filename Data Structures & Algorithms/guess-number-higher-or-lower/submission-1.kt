/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num: Int): Int
 */

class Solution : GuessGame() {
    /** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
 fun guessNumber(n:Int):Int {
        if(n == 1) return 1

        var left = 0
        var right = n
        while(left <= right){
            val mid = left + (right - left) / 2
            when(guess(mid)){
                -1 -> right = mid - 1
                1 -> left = mid + 1
                else ->{
                    return mid
                }
            }
        }
        return left
    }
}
}
