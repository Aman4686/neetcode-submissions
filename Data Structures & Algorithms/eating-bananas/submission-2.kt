class Solution {
fun minEatingSpeed(piles: IntArray = intArrayOf(3,6,7,11), h: Int = 8): Int {
  //  var left = 0
 //   var right = piles.max()

 //   while (left <= right) {
 //       val mid = left + (right - left) / 2
        var mid = piles.min()
        var sumHours = calculateSum(piles, mid)

        while(sumHours > h){
            mid += 1
            sumHours = calculateSum(piles, mid)
           // println(sumHours)
        }

      //  println(mid)
    return mid
}

fun calculateSum(piles: IntArray, mid: Int): Int{
    var sum = 0
    for (pile in piles) {
        sum += ceil(pile / mid.toDouble()).toInt()
    }
    return sum
}
}
