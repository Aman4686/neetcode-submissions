class Solution {
  fun carFleet(target: Int = 12, position: IntArray = intArrayOf(10,8,0,5,3), speed: IntArray = intArrayOf(2,4,1,1,3)): Int {

    val list = mutableListOf<Pair<Int, Int>>()
    for (i in position.indices){
        list.add(position[i] to speed[i])
    }
    list.sortByDescending { it.first }


    val stack = ArrayDeque<Int>()

    for(num in list){
        val position = num.first
        val speed = num.second
    
        val time = (target - position) / speed

        if(stack.isNotEmpty() && stack.last() <= time){
            stack.removeLast()
        }
        stack.add(time)
    }

    return stack.size
}

}
