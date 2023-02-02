package programmers.level0.daily.day19

class DuplicatedNumbers {
    fun solution(array: IntArray, n: Int): Int = array.filter { it == n }.count()
}