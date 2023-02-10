package programmers.level0.day7

class SumOfOdds {
    fun solution(n: Int): Int = (2..n).filter { it % 2 == 0 }.sum()
}