package programmers.level0.day18

import kotlin.math.pow

class BacterialGrowth {
    fun solution(n: Int, t: Int): Int  = (n * 2.0.pow(t)).toInt()
    // shift 연산자가 있더라.. ㅠ 정진하자.
    // fun solution(n: Int, t: Int): Int = n shl t
}