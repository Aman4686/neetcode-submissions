class Solution {
    fun minEatingSpeed(piles: IntArray = intArrayOf(1,4,3,2), h: Int = 9): Int {
    var left = 0
    var right = piles.max()

    while (left <= right) {
        val mid = left + (right - left) / 2
        val sumHours = calculateSum(piles, mid)

        println(sumHours)
        when {
            sumHours <= h -> return mid
            else -> left = mid + 1
        }
    }
    return 0
}

fun calculateSum(piles: IntArray, mid: Int): Int{
    var sum = 0
    for (pile in piles) {
        sum += ceil(pile / mid.toDouble()).toInt()
    }
    return sum
}
}
