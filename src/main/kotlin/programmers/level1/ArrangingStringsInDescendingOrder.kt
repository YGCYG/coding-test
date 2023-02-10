package programmers.level1

// 문자열 내림차순으로 배치하기
class ArrangingStringsInDescendingOrder {
    fun solution(s: String): String {
        if (s.length < 1) throw error("not in range")
        return s.toCharArray().sortedArrayDescending().joinToString("")
    }
}