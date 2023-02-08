package programmers.level0.daily.day15

class AppearOnceChar {
    fun solution(s: String): String = s.toList().distinct().filter { s.count { c -> it == c } == 1 }.sorted().joinToString("")
}