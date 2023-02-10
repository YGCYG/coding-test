package programmers.level0.day20

import kotlin.math.abs

class AreaOfRectangle {
    fun solution(dots: Array<IntArray>): Int {
        val width = dots.map { it[0] }.distinct().reduce { acc, i -> acc - i }
        val height = dots.map { it[1] }.distinct().reduce { acc, i -> acc - i }

        return abs(width * height)
    }
}