package programmers.level0.daily.day22

class Parallel {
    fun solution(dots: Array<IntArray>): Int {
        val gradList = listOf (
            gradient(dots[0], dots[1]),
            gradient(dots[0], dots[2]),
            gradient(dots[0], dots[3]),
            gradient(dots[1], dots[2]),
            gradient(dots[1], dots[3]),
            gradient(dots[2], dots[3]),
        )

        return if (gradList.size == gradList.distinct().size) 0 else 1
    }

    fun gradient(d1: IntArray, d2: IntArray): Double = (d2[1]-d1[1]).toDouble()/(d2[0]-d1[0])
}