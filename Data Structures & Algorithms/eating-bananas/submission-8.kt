class Solution {
    var left = 1
    var right = piles.max()
    var saved = 0
    while (left < right) {
        val mid = left + (right - left) / 2
        val sum = calculateSum(piles, mid)
        saved = mid
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
