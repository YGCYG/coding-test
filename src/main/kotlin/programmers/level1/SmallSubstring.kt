package programmers.level1

// 크기가 작은 부분 문자열
class SmallSubstring {
    fun solution(t: String, p: String): Int {
        return subSampling(t, p.length)
            .filter { it.toLong() <= p.toLong() }
            .size
    }

    fun subSampling(t: String, idx: Int): List<String> {
        return (0..t.length - idx).map { i ->
            t.substring(i, i + idx)
        }
    }
}