package programmers.level0.daily.day12

class AdditionOfHiddenNumbers1 {
    fun solution(my_string: String): Int = my_string.filter { it.isDigit() }.sumOf { it.digitToInt() }

}