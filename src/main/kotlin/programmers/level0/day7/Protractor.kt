package programmers.level0.day7

class Protractor {
    fun solution(angle: Int): Int = when {
        0 < angle && angle < 90 -> 1
        angle == 90 -> 2
        90 < angle && angle < 180 -> 3
        angle == 180 -> 4
        else -> -1
    }
}