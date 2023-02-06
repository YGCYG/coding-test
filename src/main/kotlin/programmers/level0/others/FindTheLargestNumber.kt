package programmers.level0.others

class FindTheLargestNumber {
    fun solution(array: IntArray): IntArray {
        val max = array.maxOf { it }
        val idx = array.indexOf(max)
        return intArrayOf(max, idx)
    }
}