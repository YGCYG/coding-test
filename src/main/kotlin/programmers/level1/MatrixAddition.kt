package programmers.level1

// 행렬의 덧셈
class MatrixAddition {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        if (arr1.size > 500 || arr2.size > 500) throw error("not in range")
        return arr1.zip(arr2) { a, b -> a.zip(b) { c, d -> c + d }.toIntArray() }.toTypedArray()
    }
}