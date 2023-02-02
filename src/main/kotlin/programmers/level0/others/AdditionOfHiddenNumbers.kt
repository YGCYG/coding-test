package programmers.level0.others

class AdditionOfHiddenNumbers {
    fun solution(my_string: String): Int = my_string.filter { it.isDigit() }.sumOf { it.digitToInt() }

}