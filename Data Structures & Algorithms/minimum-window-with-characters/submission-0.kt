class Solution {
    fun minWindow(s: String, t: String): String {
    if(s == t) return t

    val tSet = t.toSet()
    val window = hashSetOf<Char>()
    val windowString = StringBuilder("")

    var result = ""
    var resultSize = Int.MAX_VALUE

    for(char in s){
        window.add(char)
        windowString.append(char)

        while (window.containsAll(tSet)){
            if(windowString.length < resultSize){
                resultSize = windowString.length
                result = windowString.toString()
            }

            val firstChar = windowString.first()
            window.remove(firstChar)
            windowString.deleteAt(0)
        }
    }
    println(window)

    return result
}
}
