package programmers.level2

// 가장 큰 수
class LargestNumber {
    fun solution(numbers: IntArray): String =
        numbers.map { it.toString() }
            .sortedWith { p0, p1 -> (p1 + p0).toInt() - (p0 + p1).toInt() }
            .reduce { acc, i -> acc + i }
            .let { if ( it.all { c -> c == '0'}) "0" else it }
}