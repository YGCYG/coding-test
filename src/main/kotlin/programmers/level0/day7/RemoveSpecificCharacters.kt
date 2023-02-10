package programmers.level0.day7

class RemoveSpecificCharacters {
    fun solution(my_string: String, letter: String): String = my_string.filter { it != letter.first() }
}