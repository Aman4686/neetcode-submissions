class Solution {
 fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val set = hashSetOf<Int>()

    var resultArray = mutableListOf<Int>()

    for(num in nums){
        if(set.contains(num)){
            resultArray.add(num)

            if(k == resultArray.size){
                return resultArray.toIntArray()
            }
        }else{
            set.add(num)
        }
    }

    return intArrayOf()
}
}
