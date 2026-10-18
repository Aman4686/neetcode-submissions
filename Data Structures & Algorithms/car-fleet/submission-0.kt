class Solution {
  fun carFleet(target: Int = 10, position: IntArray = intArrayOf(4,1,0,7), speed: IntArray = intArrayOf(2,2,1,1)): Int {

    val list = mutableListOf<Pair<Int, Int>>()
    for (i in position.indices){
        list.add(position[i] to speed[i])
    }
    list.sortByDescending { it.first }


    val set = mutableSetOf<Int>()
    
    for(num in list){
        val position = num.first
        val speed = num.second

        val time = (target - position) / speed
        set.add(time)
        
        println(time)
    }

    return set.size
}

}
