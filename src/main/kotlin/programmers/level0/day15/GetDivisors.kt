package programmers.level0.day15

class GetDivisors {
    fun solution(n: Int): IntArray = (1..n).filter { n % it == 0 }.toIntArray()
}