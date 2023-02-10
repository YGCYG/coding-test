package programmers.level1

// 제일 작은 수 제거하기
class EliminateTheSmallestNumber {
    fun solution(arr: IntArray): IntArray {
        if (arr.size < 1) throw error("not in range")
        else if (arr.size == 1) return intArrayOf(-1)

        val lowest = arr.sorted().first()
        return arr.filterNot { it == lowest}.toIntArray()
    }
}