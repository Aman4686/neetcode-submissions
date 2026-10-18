class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    val sCharArray = s.toCharArray()
    for(sChar in sCharArray){
        if(!t.contains(sChar)){
            return false
        }
    }
    
    return true
}
}
