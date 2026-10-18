class Solution {
fun minWindow(s: String, t: String): String {
    if(s == t) return t

    val tSet = t.toSet()
    val window = hashMapOf<Char, Int>()
    val windowString = StringBuilder("")

    var result = ""
    var resultSize = Int.MAX_VALUE

    for(char in s){
        window[char] = window.getOrDefault(char, 0) + 1
        windowString.append(char)

        while (isContainBase(window, tSet)){
            if(windowString.length < resultSize){
                resultSize = windowString.length
                result = windowString.toString()
            }

            val firstChar = windowString.first()
            val firstCharValue = window[firstChar] ?: 0
            window[firstChar] = firstCharValue - 1

            windowString.deleteAt(0)
        }
    }
    println(window)

    return result
}

fun isContainBase(window: HashMap<Char, Int>, t: Set<Char>): Boolean{
    t.forEach {
        if(window.getOrDefault(it, 0) < 1){
            return false
        }
    }
    return true
}
}
