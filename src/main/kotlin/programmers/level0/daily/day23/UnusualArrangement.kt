package programmers.level0.daily.day23

import kotlin.math.abs

class UnusualArrangement {
    fun solution(numlist: IntArray, n: Int): IntArray =
        numlist.sortedWith ( compareBy( { abs (it - n)}, { -it } )).toIntArray()

//    thenByDescending 이란 것도 있음.
//    fun solution(numlist: IntArray, n: Int): IntArray =
//        numlist.sortedWith ( compareBy<Int> { abs (it - n)}.thenByDescending { it } )
//            .toIntArray()
}