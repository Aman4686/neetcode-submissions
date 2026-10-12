class Solution {
    fun subsetXORSum(nums: IntArray): Int {
    var result = 0
    val current = mutableListOf<Int>()

    fun backtrack(startIndex: Int){
        result += sumXOR(current)
        for(i in startIndex until nums.size){
            current.add(nums[i])
            backtrack(i + 1)
            current.removeLast()
        }
    }
    backtrack(0)

    return result

}

fun sumXOR(list: List<Int>) : Int{
    var result = 0

    for(num in list){
        result = result xor num
    }

    return result
}
}