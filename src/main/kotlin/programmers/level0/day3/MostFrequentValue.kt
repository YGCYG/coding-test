package programmers.level0.day3

class MostFrequentValue {
    fun solution(array: IntArray): Int {
        val count = array.toList().groupingBy { it }.eachCount()
        val max = count.maxOf { it.value }
        val result = count.filter { it.value == max}

        return if (result.size > 1) -1 else result.keys.first()
    }
}