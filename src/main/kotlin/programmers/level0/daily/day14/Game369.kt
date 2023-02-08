package programmers.level0.daily.day14

class Game369 {
    fun solution(order: Int): Int = order.toString().filter { it == '3' || it == '6' || it == '9'}.length
}