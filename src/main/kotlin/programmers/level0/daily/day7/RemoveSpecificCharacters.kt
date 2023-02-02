package programmers.level0.daily.day7

class RemoveSpecificCharacters {
    fun solution(my_string: String, letter: String): String = my_string.filter { it != letter.first() }
}