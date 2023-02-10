package programmers.level0.day19

class DuplicatedNumbers {
    fun solution(array: IntArray, n: Int): Int = array.filter { it == n }.count()
}