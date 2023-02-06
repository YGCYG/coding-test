package programmers.level0.daily.day10

class RotateTheArray {
    fun solution(numbers: IntArray, direction: String): IntArray {
        return if (direction == "right") {
            val sub = numbers.slice(1 until numbers.size)
            (sub + listOf(numbers[0])).toIntArray()
        } else {
            val sub = numbers.slice(0 until numbers.size-1)
            (listOf(numbers[numbers.size-1]) + sub).toIntArray()
        }
    }
}