package programmers.level2

// 쿼드압축 후 개수 세기
class CountAfterQuadCompression {
    fun solution(arr: Array<IntArray>): IntArray {
        val compressed = compress(arr.toList().map { it.toList() })
        return intArrayOf(compressed.count { it == 0 }, compressed.count { it == 1 })
    }

    fun compress(arr: List<List<Int>>): List<Int> =
        if (arr.isEmpty()) listOf()
        else {
            when (arr.sumOf { a -> a.sumOf { it } }) {
                0 -> listOf(0)
                arr.size * arr.first().size -> listOf(1)
                else -> {
                    compress(arr.subList(0, arr.size/2).map { it.subList(0, arr.size/2) }) +
                    compress(arr.subList(0, arr.size/2).map { it.subList(arr.size/2, arr.size)}) +
                    compress(arr.subList(arr.size/2, arr.size).map { it.subList(0, arr.size/2) }) +
                    compress(arr.subList(arr.size/2, arr.size).map { it.subList(arr.size/2, arr.size)})
                }
            }
        }
}