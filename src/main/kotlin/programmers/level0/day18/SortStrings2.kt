package programmers.level0.day18

class SortStrings2 {
    fun solution(my_string: String): String = my_string.map { it.lowercase() }.sorted().joinToString("")
}