package programmers.level0.daily.day4

import kotlin.math.ceil

class PizzaSharing1 {
    fun solution(n: Int): Int = ceil(n.toDouble() / 7).toInt()
}