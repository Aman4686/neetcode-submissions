class Solution {
fun majorityElement(nums: IntArray = intArrayOf(1,1,1,2,2,2,3,3)): List<Int> {
    if (nums.size == 1) return nums.asList()
    nums.sort()

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
                println("add $candidate")
                candidates.add(candidate)
                votes = 0
                candidate = -1
            }
        }

        if (votes >= 0 && candidate > 0) {
            println("add $candidate")
            candidates.add(candidate)
        }
    }



    val result = mutableListOf<Int>()
    for(candidate in candidates){

        var counter = 0
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