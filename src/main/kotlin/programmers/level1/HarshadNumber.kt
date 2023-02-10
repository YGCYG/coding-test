package programmers.level1

// 하샤드 수
class HarshadNumber {
    fun solution(x: Int): Boolean {
        if ( x < 1 || x > 10000) throw error("not in range")
        val sum = x.toString().map { it.digitToInt() }.sum()

        return if ( x % sum == 0) true else false
    }
}