package programmers.level1

// 가장 가까운 같은 글
class NearestIdenticalLetter {
    fun solution(s: String): IntArray {
        return s.mapIndexed { i, c ->
            val idx = s.substring(0, i).lastIndexOf(c)
            if (idx < 0) -1
            else if (idx >= i) -1
            else i - idx
        }.toIntArray()
    }
}