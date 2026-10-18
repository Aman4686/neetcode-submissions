class Solution {
fun minWindow(s: String, t: String): String {
    if(s == t) return t

    val tMap = hashMapOf<Char, Int>()
    t.forEach {
        tMap[it] = tMap.getOrDefault(it, 0) + 1
    }


    val window = hashMapOf<Char, Int>()

    var start = 0
    var end = 0
    var bestSize = Int.MAX_VALUE

    for(i in s.indices){
        val char = s[i]
        window[char] = window.getOrDefault(char, 0) + 1

        while (isContainBase(window, tMap)){
            end = i
            if(end - start < bestSize){
                bestSize = end - start
            }

            val firstChar = s[start]
            val firstCharValue = window[firstChar] ?: 0
            window[firstChar] = firstCharValue - 1

            start++
        }
    }
    println(window)
    start--
    return if(start !in 0..end) "" else s.substring(start..end)
}

fun isContainBase(window: HashMap<Char, Int>, t: HashMap<Char, Int>): Boolean{
    t.forEach { entry ->

        if(window.getOrDefault(entry.key, 0) < entry.value){
            return false
        }
    }
    return true
}
}
