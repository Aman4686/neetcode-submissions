class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for(i in m-1 downTo 0){
            val num = nums1[i]
            nums1[i+n] = num
        }
        for(i in 0 until n){
            val num = nums2[i]
            nums1[i] = num
        }
    
    }
}
