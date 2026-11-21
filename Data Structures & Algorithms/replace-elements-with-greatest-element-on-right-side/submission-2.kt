class Solution {
    fun replaceElements(arr: IntArray): IntArray {
    var temp = Int.MIN_VALUE
    val result = IntArray(arr.size) { -1 }
    for(i in arr.size-1  downTo 0){

        if(arr[i] > temp){
            temp = arr[i]
        }
        if(i-1 >= 0) {
            result[i - 1] = temp
        }
    }
  
    return result
}
}
