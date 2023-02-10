package programmers.level0.day24

class TheNumberOfK {
    fun solution(i: Int, j: Int, k: Int): Int =
        (i..j).map { it.toString().count { c -> c == k.digitToChar() }}
            .sumOf { it }
}