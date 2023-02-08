package programmers.level0.daily.day12

class VowelRemoval {
    fun solution(my_string: String): String {
        val vowel = listOf('a', 'e', 'i', 'o', 'u')
        return my_string.filterNot { it in vowel }
    }
}