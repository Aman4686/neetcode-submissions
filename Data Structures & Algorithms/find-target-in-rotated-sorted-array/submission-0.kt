class Solution {
   fun search(nums: IntArray = intArrayOf(4,5,6,7,0,1,2), target: Int = 4): Int {

    val minIndex = findMinIndex(nums)
    val maxIndex = findMaxIndex(nums)

    val min = nums[minIndex]
    val max = nums[maxIndex]
    //println(min)
    //println(max)
    if(nums.first() == min && nums.last() == max){
        return binarySearch(nums = nums, target = target, left = 0, right = nums.size - 1)
    }
    var left = 0
    var right = nums.size - 1

    if(target >= min && target <= nums.last()){
        //println("is in right side")
        left = minIndex
    }else{
        //println("is in left side")
        right = maxIndex
    }

    return binarySearch(nums = nums, target = target, left = left, right = right)
}

fun binarySearch(nums: IntArray, target: Int, left: Int, right: Int): Int{
    var left = left
    var right = right

    while(left <= right){
        val mid = left + (right - left) / 2
        val midNum = nums[mid]

       // printSearch(nums, left, right)
        when{
            target == midNum -> return mid
            target < midNum -> {
                right = mid - 1
            }
            else -> left = mid + 1
        }
    }

    return -1
}

fun findMinIndex(nums: IntArray): Int{
    var left = 0
    var right = nums.size - 1
    var minIndex = Int.MAX_VALUE

    while(left <= right){
        val mid = left + (right - left) / 2

        val midNum = nums[mid]
        when{
            midNum > nums.last() -> {
                left = mid + 1
            }
            else -> {
                right = mid - 1
                minIndex = mid

            }
        }
    }

    return minIndex
}

fun findMaxIndex(nums: IntArray): Int{
    var left = 0
    var right = nums.size - 1
    var maxIndex = Int.MIN_VALUE

    while(left <= right){
        val mid = left + (right - left) / 2

        val midNum = nums[mid]
        when{
            midNum < nums.first() -> {
                right = mid - 1
            }
            else -> {
                left = mid + 1
                maxIndex = mid

            }
        }
    }

    return maxIndex
}


}