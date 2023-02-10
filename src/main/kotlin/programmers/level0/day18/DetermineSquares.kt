package programmers.level0.day18

import kotlin.math.sqrt

class DetermineSquares {
    fun solution(n: Int): Int {
        val sqrt = sqrt(n.toDouble()).toInt()
        return if (sqrt*sqrt == n) 1 else 2
    }

}