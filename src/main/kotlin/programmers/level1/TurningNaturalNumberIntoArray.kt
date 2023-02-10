package programmers.level1

// 자연수 뒤집어 배열로 만들
class TurningNaturalNumberIntoArray {
    fun solution(n: Long): IntArray {
        if (n < 1 || n > 10000000000) throw error("not in range")
        return n.toString().map{ (it-'0').toInt() }.toIntArray().reversedArray()
    }
}