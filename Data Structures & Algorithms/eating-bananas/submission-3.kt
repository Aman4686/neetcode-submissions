class Solution {
fun minEatingSpeed(piles: IntArray = intArrayOf(312884470), h: Int = 312884468): Int {
    val max = piles.max()
    for(i in 1 until max){
        val sum = calculateSum(piles, i)
        if(sum <= h) return i
    }
    return 0
}
}
