package programmers.level0.daily.day10

class LocationOfPoint {
    fun solution(dot: IntArray): Int =
    if (dot[0] > 0) {
        if (dot[1] > 0) 1 else 4
    } else {
        if (dot[1] > 0) 2 else 3
    }
}