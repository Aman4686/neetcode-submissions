class TimeMap() {
val hashMap = hashMapOf<String, MutableList<Pair<Int, String>>>()

fun set(key: String, value: String, timestamp: Int) {
    val list = hashMap[key] ?: mutableListOf()
    list.add(timestamp to value)

    hashMap[key] = list
}
// 1,2,3,4,5 target 6
fun get(key: String, timestamp: Int): String {
    val list = hashMap[key]
    if (list.isNullOrEmpty()) return ""

    var left = 0
    var right = list.size - 1
    var saved = Int.MIN_VALUE
    while (left <= right) {
        val mid = left + (right - left) / 2
        val midNum = list[mid].first

       // printSearch(list, left, right)

        when {
            timestamp == midNum -> return list[mid].second
            timestamp < midNum -> {
               right = mid - 1
            }
            else -> {

               left = mid + 1
                saved = mid
            }
        }
    }

    if(saved < 0) return ""
    return list[saved].second
}

}
