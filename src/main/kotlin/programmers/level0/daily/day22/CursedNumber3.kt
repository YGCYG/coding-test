package programmers.level0.daily.day22

class CursedNumber3 {
    fun solution(n: Int): Int  = (1..185).filterNot { it % 3 == 0 || it.toString().contains('3') }[n-1]
}