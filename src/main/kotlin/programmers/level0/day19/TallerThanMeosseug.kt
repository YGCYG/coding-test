package programmers.level0.day19

class TallerThanMeosseug {
    fun solution(array: IntArray, height: Int): Int = array.count { it > height }
}