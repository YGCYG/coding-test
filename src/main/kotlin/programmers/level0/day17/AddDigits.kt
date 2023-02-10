package programmers.level0.day17

class AddDigits {
    fun solution(n: Int): Int = n.toString().toList().sumOf { it.digitToInt() }
}