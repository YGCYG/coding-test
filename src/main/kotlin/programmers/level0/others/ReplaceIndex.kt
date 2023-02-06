package programmers.level0.others

class ReplaceIndex {
    fun solution(my_string: String, num1: Int, num2: Int): String =
        my_string.mapIndexed { idx, c ->
            when (idx) {
                num1 -> my_string[num2]
                num2 -> my_string[num1]
                else -> c
            }
        }.joinToString("")
}