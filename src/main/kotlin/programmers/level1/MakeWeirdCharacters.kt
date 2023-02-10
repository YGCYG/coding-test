package programmers.level1

// 이상한 문자 만들기
class MakeWeirdCharacters {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") { it.mapIndexed { idx, c -> if (idx % 2 == 0) c.toUpperCase() else c.toLowerCase()}.joinToString("")}
    }
}