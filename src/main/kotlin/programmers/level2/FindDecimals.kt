package programmers.level2

import kotlin.math.pow
import kotlin.math.sqrt

// 소수 찾기
// 다른 풀이 함 해보자..
class FindDecimals {
    fun solution(numbers: String): Int =
        (1 until 10.toDouble().pow(numbers.length).toInt()).filter {
            val list1 = numbers.toList()
            val list2 = it.toString().toList()
            if ( list1.containsAll(list2)) {
                for ( i in list1.distinct()) {
                    if (list1.count { l1 -> l1 == i } < list2.count { l2 -> l2 == i }) return@filter false
                }
                true
            } else false
        }.count { isPrime(it) }

    fun isPrime(num: Int): Boolean {
        return if ( num <= 1 ) false
        else (2..sqrt(num.toDouble()).toInt()).none { num % it == 0 }
    }
}