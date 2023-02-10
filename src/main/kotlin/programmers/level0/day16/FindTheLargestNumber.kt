package programmers.level0.day16

class FindTheLargestNumber {
    fun solution(array: IntArray): IntArray {
        val max = array.maxOf { it }
        val idx = array.indexOf(max)
        return intArrayOf(max, idx)
    }
}