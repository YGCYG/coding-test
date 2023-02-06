package programmers.level0.daily.day11

import kotlin.math.sqrt

class FindCompositeNumbers {
    fun solution(n: Int): Int = (1..n).filterNot { isPrime(it) }.size

    fun isPrime(num: Int): Boolean {
        return if ( num <= 1 ) true
        else (2..sqrt(num.toDouble()).toInt()).none { num % it == 0}
    }
}