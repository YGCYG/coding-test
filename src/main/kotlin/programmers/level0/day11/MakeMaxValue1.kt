package programmers.level0.day11

class MakeMaxValue1 {
    fun solution(numbers: IntArray): Int = numbers.sortedDescending().run { this[0] * this[1] }
}