package programmers.level1

import kotlin.math.sqrt
import kotlin.math.pow

// 정수 제곱근 판별
class IntegerSquareRootDetermination {
    fun solution(n: Long): Long {
        if ( n < 1 || n > 50000000000000) return -1L

        val sq = sqrt(n.toDouble())
        return if (sq % 1.0 == 0.0) (sq+1).pow(2.0).toLong() else -1L
    }
}