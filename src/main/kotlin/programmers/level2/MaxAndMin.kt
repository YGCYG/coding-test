package programmers.level2

// 최댓값과 최솟값
class MaxAndMin {
    fun solution(s: String): String  =
    s.split(" ")
        .map { it.toInt() }
        .let { i -> "${i.minOf { it }} ${i.maxOf { it }}" }
}