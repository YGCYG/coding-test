package programmers.level0.daily.day25

class NextNumber {
    fun solution(common: IntArray): Int {
        val first = common[1] - common[0]
        val second = common[2] - common[1]

        return if ( first == second ) common.last() + first
        else common.last() * (second / first)
    }
}