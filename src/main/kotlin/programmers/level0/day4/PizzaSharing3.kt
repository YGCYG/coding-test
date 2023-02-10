package programmers.level0.day4

import kotlin.math.ceil

class PizzaSharing3 {
    fun solution(slice: Int, n: Int): Int = ceil(n.toDouble()/slice).toInt()
}