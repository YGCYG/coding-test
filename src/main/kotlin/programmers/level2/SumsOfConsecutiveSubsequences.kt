package programmers.level2

// 연속 부분 수열 합의 개수
class SumsOfConsecutiveSubsequences {
    fun solution(elements: IntArray): Int =
        elements.indices
            .map { idx -> sum(elements.toList(), idx+1) }
            .reduce { acc, li -> acc + li}
            .distinct()
            .sorted()
            .size

    fun sum(elmt: List<Int>, chunk: Int): List<Int> =
        elmt.overlapChunk(chunk).map { e -> e.sumOf { it } }.distinct()

    fun List<Int>.overlapChunk(size: Int): List<List<Int>> =
        indices.mapNotNull { idx ->
            if ( idx + size >= this.size*2 - 1) null
            else (this+this).subList(idx, idx + size)
        }
}