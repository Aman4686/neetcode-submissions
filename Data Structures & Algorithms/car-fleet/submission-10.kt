class Solution {
  fun carFleet(target: Int = 10, position: IntArray = intArrayOf(6,8), speed: IntArray = intArrayOf(3,2)): Int {

    val list = mutableListOf<Pair<Int, Int>>()
    for (i in position.indices){
        list.add(position[i] to speed[i])
    }
    list.sortByDescending { it.first }


    val stack = ArrayDeque<Double>()

    for(num in list){
        val position = num.first
        val speed = num.second
       // println(num)
        val time = (target - position).toDouble() / speed
       // println(time)
        if(stack.isNotEmpty() && stack.last() >= time){
            //println("removeLast")
        }else{
            stack.add(time)
        }
    }

    return stack.size
}

}
