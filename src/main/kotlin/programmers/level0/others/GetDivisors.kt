package programmers.level0.others

class GetDivisors {
    fun solution(n: Int): IntArray = (1..n).filter { n % it == 0 }.toIntArray()
}