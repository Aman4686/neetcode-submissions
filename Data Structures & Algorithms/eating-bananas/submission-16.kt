class Solution {
fun minEatingSpeed(piles: IntArray = intArrayOf(30,11,23,4,20), h: Int = 6): Int {
    var left = 1
    var right = piles.max()

    var saved = right
    while (left <= right) {
        val mid = left + (right - left) / 2
        val sum = calculateSum(piles, mid)

        when{
            sum <= h -> {
                saved = min(saved, mid)
                right = mid - 1
            }
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
