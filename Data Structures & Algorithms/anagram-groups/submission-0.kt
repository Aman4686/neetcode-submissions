class Solution {
   fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if(strs.isEmpty()) return emptyList()
    val hashMap = hashMapOf<String, MutableList<String>>()
    
    strs.forEachIndexed { index, string -> 
        val sortedStr = string.toCharArray().sorted().toString()
        val listStr = hashMap[sortedStr]
        if(listStr != null){
            listStr.add(string)
            hashMap[sortedStr] = listStr
        }else{
            hashMap[sortedStr] = mutableListOf<String>(string)
        }
    }
    
    val result = mutableListOf<MutableList<String>>()
    
    hashMap.forEach { entry ->
        result.add(entry.value)
    }
    
    return result
}
}
