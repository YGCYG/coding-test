package programmers.level0.others

class AddDigits {
    fun solution(n: Int): Int = n.toString().toList().sumOf { it.digitToInt() }
}