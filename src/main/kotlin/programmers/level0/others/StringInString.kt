package programmers.level0.others

class StringInString {
    fun solution(str1: String, str2: String): Int = if (str1.contains(str2)) 1 else 2
}