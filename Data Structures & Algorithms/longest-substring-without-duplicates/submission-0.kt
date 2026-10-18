class Solution {
   fun lengthOfLongestSubstring(s: String = "asdfgaafadhtyh"): Int {
    if(s.isEmpty()) return 0
    if(s.length == 1) return 1


    var left = 0
    var result = ""
    for(right in 0 until s.length){

        //val sunSequence = s.substring(left, right+1)
        //println(sunSequence)
        while (true){
            if(isValid( s.substring(left, right+1))) break
            left++
        }

        val tempResult = s.substring(left, right+1)
        if(tempResult.length > result.length){
            result = tempResult
        }
    }

    return result.length
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
