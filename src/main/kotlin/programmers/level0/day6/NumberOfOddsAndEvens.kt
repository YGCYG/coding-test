package programmers.level0.day6

class NumberOfOddsAndEvens {
    fun solution(num_list: IntArray): IntArray = intArrayOf(num_list.count { it % 2 == 0 }, num_list.count { it % 2 == 1 })
}