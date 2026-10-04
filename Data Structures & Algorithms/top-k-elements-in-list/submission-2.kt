class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()
    val freq = Array(nums.size+1) { mutableListOf<Int>() }
    val result = mutableListOf<Int>()

    for(num in nums){
        val count = hashMap.getOrDefault(num , 0) + 1
        hashMap[num] = count
    }
    for(entry in hashMap){
        println(entry)
        freq[entry.value].add(entry.key)
    }

    for(i in freq.size-1 downTo 1){

        for(item in freq[i]){
            result.add(item)
            if(result.size == k) return result.toIntArray()
        }
       // val item = freq[i]
    }


    return result.toIntArray()
}
}
