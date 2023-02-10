package programmers.level1

// 과일 장수
class Fruiterer {
    fun solution(k: Int, m: Int, score: IntArray): Int {

        val sorted = score.sorted().toIntArray()
        val len = score.size

        val result = sorted
            .copyOfRange(len%m,len)
            .filterIndexed { i, _ -> i % m == 0 }

        return result.sum() * m
    }
}