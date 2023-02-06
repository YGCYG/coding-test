package programmers.level0.daily.day9

class RockPaperScissors {
    fun solution(rsp: String): String = rsp.map {
        when (it) {
            '5' -> '2'
            '2' -> '0'
            else -> '5'
        }
    }.joinToString("")
}