package programmers.level2

// 행렬의 곱셈
class MatrixMultiplication {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        arr1.map { i1 ->
            (arr2.first().indices).map { idx2 ->
                i1.mapIndexed { idx3, i3 ->
                    i3 * arr2[idx3][idx2]
                }.sumOf { it }
            }.toIntArray()
        }.toTypedArray()
}