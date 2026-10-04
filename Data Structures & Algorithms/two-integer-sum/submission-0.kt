class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

    val hashMap = hashMapOf<Int, Int>()

    nums.forEachIndexed { index, num ->
        val newTarget = target - num
        val value = hashMap[newTarget]
        if(value != null){
            return intArrayOf(value, index)
        }else{
            hashMap[num] = index
        }
    }
    return intArrayOf()
}
}
