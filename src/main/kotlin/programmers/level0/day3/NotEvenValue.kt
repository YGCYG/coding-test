package programmers.level0.day3

class NotEvenValue {
    fun solution(n: Int): IntArray = (1..n).filter { it % 2 != 0 }.toIntArray()
}