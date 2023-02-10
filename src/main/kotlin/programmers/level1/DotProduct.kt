package programmers.level1

// 내적
class DotProduct {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.mapIndexed { idx, num -> num * b[idx] }.sum()
    }
}