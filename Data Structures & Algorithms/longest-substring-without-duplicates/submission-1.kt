class Solution {
  fun lengthOfLongestSubstring(s: String = "asdfgaafadhtyh"): Int {
    if(s.isEmpty()) return 0
    if(s.length == 1) return 1


    var left = 0
    var result = Int.MIN_VALUE
    for(right in 0 until s.length){

        //val sunSequence = s.substring(left, right+1)
        //println(sunSequence)
        while (true){
            if(isValid( s.substring(left, right+1))) break
            left++
        }


        val tempResult = right+1 - left
        if(tempResult > result){
            result = tempResult
        }
    }

    return result
}


fun isValid(s: String): Boolean{
    val uniqueSet = hashSetOf<Char>()
    for(char in s){
        if(!uniqueSet.add(char)){
            return false
        }
    }
    return true
}
}
