class Solution {
  fun checkInclusion(s1: String, s2: String): Boolean {
    val target = hashMapOf<Char, Int>()

    for(s in s1){
       target[s] = target.getOrDefault(s, 0) + 1
    }

    val temp = hashMapOf<Char, Int>()


    val k = s1.length
    var leftIndex = 0

    for(rightIndex in s2.indices){
        val leftChar = s2[leftIndex]
        val rightChar = s2[rightIndex]

        if(rightIndex+1 > k){
            val leftValue = temp[leftChar] ?: 0
           if(leftValue <= 0) {
               temp.remove(leftChar)
           }else{
               temp[leftChar] = leftValue - 1
           }
          leftIndex++
        }

        temp[rightChar] = temp.getOrDefault(rightChar, 0) + 1

        println(temp)
        if(compareTwoHashmap(target, temp)) return true
    }

    return false
}


fun compareTwoHashmap(target: HashMap<Char, Int> , second: HashMap<Char, Int>): Boolean{
    for(entry in target){
        if(entry.value != second[entry.key]) return false
    }
    return true
}
}
