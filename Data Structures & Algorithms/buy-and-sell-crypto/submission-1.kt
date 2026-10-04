class Solution {
fun maxProfit(prices: IntArray = intArrayOf(7,1,5,3,6,4)): Int {
    var left = 0
    var windowState = 0

    for(right in 1 until prices.size){
        val result = prices[right] - prices[left]

        //println("prices[right] ${prices[right]} - prices[left] ${prices[left]} ")
        if(result > windowState){
            windowState = result
        }

        if(prices[right] < prices[left]){
            left = right
        }
    }


    return windowState
}
}
