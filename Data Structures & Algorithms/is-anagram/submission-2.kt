class Solution {
fun isAnagram(first: String, second: String): Boolean {

    if(first.length != second.length) return false

    val firstHashMap = hashMapOf<Char, Int>()
    val secondHashMap = hashMapOf<Char, Int>()

    first.forEach {
        val count = firstHashMap.getOrDefault(it, 0) + 1
        firstHashMap[it] = count
    }

    second.forEach {
        val count = secondHashMap.getOrDefault(it, 0) + 1
        secondHashMap[it] = count
    }

    for (entry in firstHashMap){
        val secondValue = secondHashMap[entry.key]
        val firstValue = entry.value
        
        if(secondValue != firstValue){
            return false
        }
    }


    return true
}
}
