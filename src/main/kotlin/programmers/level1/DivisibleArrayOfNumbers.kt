package programmers.level1

// 나누어 떨어지는 숫자 배열
class DivisibleArrayOfNumbers {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        if (arr.size < 1 || divisor < 1) throw error("not in range")
        val list = arr.filter { it % divisor == 0 }
        return if (list.size == 0) intArrayOf(-1) else list.sorted().toIntArray()
    }
}