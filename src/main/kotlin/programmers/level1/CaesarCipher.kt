package programmers.level1

// 시저 암호
class CaesarCipher {
    fun solution(s: String, n: Int): String {
        if (s.length > 8000 || n < 1 || n > 25) throw error("not in range")
        return s.map {
            when (it) {
                in 'a'..'z' -> if ((it + n) in 'a'..'z') it + n else it + n - ('z' - 'a') - 1
                in 'A'..'Z' -> if ((it + n) in 'A'..'Z') it + n else it + n - ('Z' - 'A') - 1
                else -> ' '
            }
        }.joinToString("")
    }
}