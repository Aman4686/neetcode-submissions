class Solution {
fun merge(nums1: IntArray = intArrayOf(10,20,20,40,0,0), m: Int = 4, nums2: IntArray = intArrayOf(1,2), n: Int = 2) {
    var i = m - 1
    var j = n - 1

    val size = m + n - 1

    for (lastIndex in size downTo 0){
        val num1 = if(i < 0) Int.MIN_VALUE else nums1[i]
        val num2 = if(j < 0) Int.MIN_VALUE else nums2[j]
        println("num1 $num1 > num2 $num2")

        if(num1 > num2){
            nums1[lastIndex] = num1
            i--
        }else{
            nums1[lastIndex] = num2
            j--
        }
        println(nums1.toList())
    }
}
}
