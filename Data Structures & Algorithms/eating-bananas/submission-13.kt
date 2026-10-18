class Solution {
fun minEatingSpeed(piles: IntArray = intArrayOf(1, 4, 3, 2), h: Int = 9): Int {
    var left = 0
    var right = piles.max()
    var saved = 0
    while (left <= right) {
        val mid = left + (right - left) / 2
        val sum = calculateSum(piles, mid)
        if(mid != 0){
            saved = mid
        }
        println(saved)
        when{
            sum <= h -> right = mid - 1
            else -> left = mid + 1
        }
    }
    return saved
}

fun calculateSum(piles: IntArray, mid: Int): Int{
    var sum = 0
    for (pile in piles) {
        sum += ceil(pile / mid.toDouble()).toInt()
    }
    return sum
}
}
