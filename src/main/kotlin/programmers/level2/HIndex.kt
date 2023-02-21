package programmers.level2

// H-Index
class HIndex {
    fun solution(citations: IntArray): Int {
        for (i in citations.size downTo 1) {
            if ( citations.count { it >= i } >= i && citations.count { it < i } <= i) return i
        }
        return 0
    }
}