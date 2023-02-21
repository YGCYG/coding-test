package programmers.level2

import kotlin.math.sqrt

// 카펫
class Carpet {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        val sqrtTotal = sqrt(total.toDouble()).toInt()
        if (sqrtTotal*sqrtTotal == total) return intArrayOf(sqrtTotal, sqrtTotal)

        val divs = (1..total).filter { total % it == 0 }.reversed()

        for (i in divs) {
            for (j in divs) {
                if ( (i * j == total) && (i + j == (brown/2 + 2)))
                    return intArrayOf(i, j)
            }
        }

        return intArrayOf(0, 0)
    }
}