package programmers.level0.day13

class LengthOfArrayElement {
    fun solution(strlist: Array<String>): IntArray = strlist.map { it.length }.toIntArray()
}