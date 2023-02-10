package programmers.level0.day6

class PrintTextRepeatedly {
    fun solution(my_string: String, n: Int): String = my_string.map { it.toString().repeat(n) }.joinToString("")
}