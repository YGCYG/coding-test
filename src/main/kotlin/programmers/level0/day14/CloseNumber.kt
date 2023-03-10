package programmers.level0.day14

import kotlin.math.abs

class CloseNumber {
    fun solution(array: IntArray, n: Int): Int = array.sortedWith ( compareBy( { abs (it - n)}, { it } )).first()
}