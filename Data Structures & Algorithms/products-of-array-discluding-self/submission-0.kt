class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    for (i in 0..nums.size - 1){
        var temp = 1
        println("---------")
        for(j in i + 1..nums.size - 1){
            temp *= nums[j]
          //  println(nums[j])
        }

        for(k in i - 1 downTo 0){
            temp *= nums[k]
            //println(nums[k])
        }
         result[i] = temp
    }

    return result
}
}
