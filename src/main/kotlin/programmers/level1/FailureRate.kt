package programmers.level1

// 실패율
class FailureRate {
    fun solution(N: Int, stages: IntArray): IntArray {
        val failRatio = (1..N).map { s ->
            val arrival = stages.filter { u -> u >= s }.size
            if ( arrival == 0 ) 0.0
            else  stages.filter { u -> u == s }.size.toDouble() / arrival
        }
        val zipRatio = (1..N).zip(failRatio).sortedBy { it.second }.reversed().groupBy { it.second }
        return zipRatio.map { it.value.map { it.first }.sorted() }.flatten().toIntArray()
    }
}