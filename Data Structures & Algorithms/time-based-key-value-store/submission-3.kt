class TimeMap() {
val hashMap = hashMapOf<String, MutableList<String>>()

fun set(key: String, value: String, timestamp: Int) {
    val list = hashMap[key] ?: mutableListOf()
    list.add("$value%$timestamp")

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
        val midNum = getNumber(list[mid])

     //   printSearch(list, left, right)

        when {
            timestamp == midNum -> return getValue(list[mid])
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
    return getValue(list[saved])
}

private fun getNumber(str: String?): Int {
    
    if(str == null) return -1
    
    return str.split(
        '%'
    ).last().toInt()
}

private fun getValue(str: String?): String {
    if(str == null) return ""
    
    return str.split(
        '%'
    ).first()
}


}
