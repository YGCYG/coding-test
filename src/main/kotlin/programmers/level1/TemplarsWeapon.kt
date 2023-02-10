package programmers.level1

import kotlin.math.sqrt

// 기사단원의 무기
class TemplarsWeapon {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var result = 0
        for (i in 1..number) {
            result += countDiv(i, limit, power)
        }
        return result
    }

    fun countDiv(num: Int, limit: Int, power: Int): Int {
        var result = 0
        for ( k in 1..sqrt(num.toDouble()).toInt()) {
            if (num % k == 0) {
                if ( num / k == k) result += 1
                else result += 2
            }
            if (result > limit) return power
        }

        return result
    }
}