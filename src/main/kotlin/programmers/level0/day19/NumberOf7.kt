package programmers.level0.day19

class NumberOf7 {
    fun solution(array: IntArray): Int = array.joinToString("").count { it == '7'}
}