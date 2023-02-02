package programmers.level0.daily.day11

class MakeMaxValue1 {
    fun solution(numbers: IntArray): Int = numbers.sortedDescending().run { this[0] * this[1] }
}