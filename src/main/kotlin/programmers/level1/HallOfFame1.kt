package programmers.level1

// 명예의 전당 (1)
class HallOfFame1 {
    fun solution(k: Int, score: IntArray): IntArray {
        val honor = mutableListOf<Int>()
        val result = mutableListOf<Int>()

        for (i in 0 until score.size) {
            if (i < k) honor.add(score[i])
            else {
                honor[0] = if ( honor[0] < score[i] ) score[i] else honor[0]
            }

            honor.sort()
            result.add(honor[0])
        }

        return result.toIntArray()
    }
}