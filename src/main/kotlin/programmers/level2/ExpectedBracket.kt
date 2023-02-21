package programmers.level2

// 예상 대진표
class ExpectedBracket {
    fun solution(n: Int, a: Int, b: Int): Int = tournament(n, a, b, 1)

    tailrec fun tournament(n: Int, a: Int, b: Int, count: Int): Int {
        val setA = if ( a % 2 == 0) a/2 else a/2 + 1
        val setB = if ( b % 2 == 0) b/2 else b/2 + 1

        return if ( setA == setB || n < 1) count
        else tournament(n/2, setA, setB, count + 1)
    }
}