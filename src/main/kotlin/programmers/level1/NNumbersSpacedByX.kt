package programmers.level1

// x만큼 간격이 있는 n개의 숫자
class NNumbersSpacedByX {
    fun solution(x: Int, n: Int): LongArray {
        if (x < -10000000 || x > 10000000) throw error("x is not in range")
        if (n < 1 || n > 1000) throw error("x is not in range")

        return (1..n).map { (x.toLong() * it.toLong()) }.toLongArray()
    }
}