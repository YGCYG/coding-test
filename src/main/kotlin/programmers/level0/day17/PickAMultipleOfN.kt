package programmers.level0.day17

class PickAMultipleOfN {
    fun solution(n: Int, numlist: IntArray): IntArray = numlist.filter { it % n == 0 }.toIntArray()
}