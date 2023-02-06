package programmers.level0.others

class MakeMaxValue2 {
    fun solution(numbers: IntArray): Int {
        val sorted = numbers.sortedArray()
        val max1 = sorted[0]
        val max2 = sorted[1]
        val min1 = sorted[sorted.size-1]
        val min2 = sorted[sorted.size-2]

        return if ( max1 * max2 > min1 * min2 ) max1 * max2 else min1 * min2
    }
}