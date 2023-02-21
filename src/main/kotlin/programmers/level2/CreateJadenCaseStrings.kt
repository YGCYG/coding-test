package programmers.level2

// JadenCase 문자열 만들기
class CreateJadenCaseStrings {
    fun solution(s: String): String = s.split(" ").map { cap(it) }.joinToString(" ")

    fun cap(s: String): String =
    when (s.length) {
        0 -> ""
        1 -> s[0].uppercase()
        else -> s[0].uppercase() + s.slice(1..s.length-1).map { it.lowercase() }.joinToString("")
    }

    // capitalize 라는 함수가 있더라..
}