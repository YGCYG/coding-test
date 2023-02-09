package programmers.level0.daily.day22

class LengthOfOverlappingSegments {
    fun solution(lines: Array<IntArray>): Int {
        val min = lines.minOf { it[0] }
        val max = lines.maxOf { it[1] }

        val vec = Array((max - min + 1)) { intArrayOf(0,0,0) }

        lines.forEachIndexed { idx, l ->
            for (i in l[0]+1..l[1]) {
                vec[i-min][idx] = 1
            }
        }

        return vec.count { p -> p.sumOf { it } > 1 }
    }
}