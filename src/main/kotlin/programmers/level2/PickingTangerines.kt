package programmers.level2

// 귤 고르기
class PickingTangerines {
    fun solution(k: Int, tangerine: IntArray): Int {
        val g = tangerine.groupBy { it }.map { it.key to it.value.size }.sortedByDescending { it.second }
        var count = 0
        for ( i in g ) {
            count += i.second
            if ( count >= k) return g.indexOf(i) + 1
            else continue
        }

        return 0
    }
}