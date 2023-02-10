package programmers.level1

// 둘만의 암호
class PasswordsBetweenUs {
    fun solution(s: String, skip: String, index: Int): String {
        val skipped = (97..122).map { it.toChar() }.filterNot { skip.contains(it) }
        val indexList = s.map {
            val skipLen = skip.length - (it.toInt()..122).count { c -> skip.contains(c.toChar()) }
            skipped[(it.toInt() - 97 + skipped.size - skipLen + index) % skipped.size]
        }
        return indexList.joinToString("")
    }
}