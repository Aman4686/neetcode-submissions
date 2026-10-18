class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()
    val result = mutableListOf<Int>()

    for(num in nums){
        val count = hashMap.getOrDefault(num , 0) + 1
        hashMap[num] = count
    }

 
    hashMap.entries.forEach {
        println(it)
        if(it.value >= 2){
            result.add(it.key)
        }

        if(k == result.size) return result.toIntArray()
    }

    return intArrayOf()
}
}
