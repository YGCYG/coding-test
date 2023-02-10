package programmers.level1

import kotlin.math.pow

// 3진법 뒤집기
class TernaryFlip {
    fun solution(n: Int): Int {
        if ( n < 1 || n > 100000000) throw error("not in range")
        val list = get3(n, intArrayOf())
        return list.reversed().foldIndexed(0) { idx, acc, el -> acc + (el * 3.0.pow(idx)).toInt() }
    }

    tailrec fun get3(n: Int, arr: IntArray): IntArray = if (n < 3) arr + n else get3(n/3, arr + (n%3))
}