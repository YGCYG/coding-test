package programmers.level0.daily.day17

class AddDigits {
    fun solution(n: Int): Int = n.toString().toList().sumOf { it.digitToInt() }
}