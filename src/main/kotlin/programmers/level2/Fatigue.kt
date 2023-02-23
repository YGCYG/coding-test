package programmers.level2

// 피로도
class Fatigue {
    fun solution(k: Int, dungeons: Array<IntArray>): Int =
        search(k, dungeons.toList(), 0, 0)

    fun search (k: Int, dg: List<IntArray>, f: Int, n: Int): Int =
        if ( dg.isEmpty() ) n
        else {
            (dg.indices).map { i ->
                if (f + dg[i][1] >= k || f + dg[i][0] > k) n
                else search(k, dg.filterIndexed { i2, _ -> i2 != i }, f + dg[i][1], n + 1)
            }.maxOf { it }
        }
}