class Solution {
   fun twoSum(
    arr: IntArray,
    target: Int,
): IntArray {

    var left = 0
    var right = arr.size -1

    while(left < right){
        if(arr[left] + arr[right] == target) return intArrayOf(left+1, right+1)

        if(arr[left] + arr[right] > target){
            right--
        }else{
            left++
        }
    }
    return intArrayOf()
}
}
