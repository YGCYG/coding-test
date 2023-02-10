package programmers.level1

// 두 정수 사이의 합
class SumBetweenTwoIntegers {
    fun solution(a: Int, b: Int): Long {
        if (a < -10000000 || a > 10000000 || b < -10000000 || b > 10000000) throw error("not in range")
        return if (b > a) (a.toLong()..b.toLong()).sum() else (b.toLong()..a.toLong()).sum()
    }
}