package programmers.level0.daily.day8

class CutArray {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.slice(num1..num2).toIntArray()
}