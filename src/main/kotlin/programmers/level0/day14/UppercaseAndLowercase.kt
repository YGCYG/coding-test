package programmers.level0.day14

class UppercaseAndLowercase {
    fun solution(my_string: String): String = my_string.map { if(it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString("")
}