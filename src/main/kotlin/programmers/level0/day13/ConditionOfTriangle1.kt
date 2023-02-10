package programmers.level0.day13

class ConditionOfTriangle1 {
    fun solution(sides: IntArray): Int {
        val max = sides.maxOf { it }
        return if (sides.sumOf { it } - max > max) 1 else 2
    }


}