package programmers.level2

import kotlin.math.sqrt

// k진수에서 소수 개수 구하
class FindTheNumberOfDecimalsInBaseK {
    fun solution(n: Int, k: Int): Int =
        n.toString(k)
            .split("0")
            .filterNot { it == "" }
            .count { isPrime(it.toLong()) }

    fun isPrime(num: Long): Boolean {
        return if ( num <= 1 ) false
        else (2..sqrt(num.toDouble()).toLong()).none { num % it == 0L }
    }
}