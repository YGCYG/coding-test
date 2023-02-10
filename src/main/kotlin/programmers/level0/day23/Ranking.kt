package programmers.level0.day23

class Ranking {
    fun solution(score: Array<IntArray>): IntArray {
        var rank: Int = 1
        val avgList = score.mapIndexed { idx, s -> idx to s.average() }
            .sortedByDescending { it.second }

        return avgList.mapIndexed { idx, a ->
            if ( idx > 0) {
                if ( a.second < avgList[idx-1].second ) rank = idx + 1
            }
            a.first to rank
        }
            .sortedBy { it.first }
            .map { it.second }
            .toIntArray()
    }

    // 흠... 더 좋은 방법이 있을텐데 형편없네..
}