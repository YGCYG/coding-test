package programmers.level1

// 수박수박수박수박수박수?
class subagsubagsubagsubagsubagsu {
    fun solution(n: Int): String {
        String()
        if ( n < 1 || n > 10000) throw error("not in range")
        return (1..n).map { if (it % 2 == 0) '박' else '수'}.joinToString ("")
    }
}