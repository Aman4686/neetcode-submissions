class NumArray(nums: IntArray) {
    val arr = LongArray(nums.size + 1)

    init {
        for(i in nums.indices){
            arr[i + 1] = arr[i] + nums[i]
        }
    }


    fun sumRange(left: Int, right: Int): Int {
        if(left == 0) return arr[right + 1].toInt()

        return (arr[right + 1] - arr[left]).toInt()
    }

}
/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */