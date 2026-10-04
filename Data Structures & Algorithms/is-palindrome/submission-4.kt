class Solution {
   fun isPalindrome(s: String = "Was it a car r a cat I saw?"): Boolean {


   if(s.isEmpty()) return true

    val charArray = s.lowercase().filter { it.isLetter() || it.isDigit() }
    
    if(charArray.length == 1) return true

    var leftPoint = 0
    var rightPoint = charArray.length - 1
    println(charArray)

    // 5 / 2 = 2

    while (charArray.length / 2 !in rightPoint..leftPoint){
        val leftLetter = charArray[leftPoint]
        val rightLetter = charArray[rightPoint]

        if(leftLetter == rightLetter){
            leftPoint += 1
            rightPoint -= 1
        }else{
            return false
        }

    }

    return true
}
}
