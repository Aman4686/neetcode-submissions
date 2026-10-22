class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(-1,-1)


        result[0] = findLeftEdge(nums, target)
        result[1] = findRightEdge(nums, target)

        return result
    }

    fun findRightEdge(nums: IntArray, target: Int): Int{
        var left = 0
        var right = nums.size - 1

        var result = -1
        while(left <= right){
            val mid = left + (right - left) / 2

            val midNum = nums[mid]
            // nums = [1,2,3,4,4,4,5,5,5,5,6,7], target = 4
            // 1,2,3,4,4,4
            // 1,2,3,4
            // if(migNum > target){
            //  right = mid - 1
            //}
            when{
                midNum > target -> {
                    right = mid - 1
                } 
                else -> {
                    if(midNum == target) result = mid
                    left = mid + 1
                }
            }
        }

        return result
    }

        fun findLeftEdge(nums: IntArray, target: Int): Int{
        var left = 0
        var right = nums.size - 1

        var result = -1
        while(left <= right){
            val mid = left + (right - left) / 2

            val midNum = nums[mid]
            // nums = [1,2,3,4,4,4,5,5,6,7], target = 4
            // 1,2,3,4,4,4
            // 1,2,3,4
            // if(migNum =< target){
            //  right = mid - 1
            //}
            when{
                midNum < target -> {
                    left = mid + 1
                } 
                else -> {
                    if(midNum == target) result = mid

                    right = mid - 1
                }
            }
        }

        return result
    }
}