package programmers.level0.others

class UppercaseAndLowercase {
    fun solution(my_string: String): String = my_string.map { if(it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString("")
}