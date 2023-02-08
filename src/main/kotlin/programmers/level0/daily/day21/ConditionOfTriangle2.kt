package programmers.level0.daily.day21

class ConditionOfTriangle2 {
    fun solution(sides: IntArray): Int {
        val max = sides.maxOf { it }
        val min = sides.minOf { it }

        val longSides = (max until max+min).filter { it < min + max }
        val shortSides = (1 until max).filter { min + it > max }

        return longSides.size + shortSides.size
    }
}