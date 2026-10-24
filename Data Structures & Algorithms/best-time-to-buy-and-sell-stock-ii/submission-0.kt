class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var savedPrice = prices[prices.size - 1]

        for(i in prices.size - 2 downTo 0){
            val currentPrice = prices[i]
            println("currentPrice ${currentPrice} savedPrice ${savedPrice}")
            if(currentPrice > savedPrice) {
                savedPrice = currentPrice
                continue
            }
        
            result += savedPrice - currentPrice
            savedPrice = currentPrice
        }
        return result
    }

}
