package programmers.level1

// 정수 내림차순으로 배치하기
class ArrangeInDescendingIntegerOrder {
    fun solution(n: Long): Long {
        if ( n < 1 || n > 8000000000) throw error("not in range")

        return n.toString().map { it }.sortedDescending().joinToString("").toLong()
    }
}