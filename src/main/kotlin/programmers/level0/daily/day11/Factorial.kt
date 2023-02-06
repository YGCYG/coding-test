package programmers.level0.daily.day11

class Factorial {
    fun solution(n: Int): Int {
        var count = 1
        for (i in 1..10) {
            if ( count * i < n ) count *= i
            else return count
        }
        return 10
    }
}