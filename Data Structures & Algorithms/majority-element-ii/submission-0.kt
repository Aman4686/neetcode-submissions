class Solution {
fun majorityElement(nums: IntArray = intArrayOf(3,2,3)): List<Int> {
    if (nums.size == 1) return nums.asList()

    val candidates = mutableSetOf<Int>()
    val target = nums.size / 3

    repeat(2){
        var votes = 0
        var candidate = -1

        for (num in nums) {
            if (votes <= 0) candidate = num
            if (num in candidates) continue

            println(candidate)
            if (candidate == num) votes++ else votes--
            
            if (votes >= target) {
                candidates.add(candidate)
                votes = 0
                candidate = num
            }
        }

        if (votes >= 0 && candidate > 0) {
            candidates.add(candidate)
        }

    }



    val result = mutableListOf<Int>()
    for(candidate in candidates){
        var counter = 1
        for (num in nums) {
            if(candidate == num){
                counter++
            }
        }

        if(counter > target){
            result.add(candidate)
        }
    }



    return result.toList()
}
}