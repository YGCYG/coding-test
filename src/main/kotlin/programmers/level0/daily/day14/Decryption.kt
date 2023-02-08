package programmers.level0.daily.day14

class Decryption {
    fun solution(cipher: String, code: Int): String = cipher.filterIndexed { idx, _ -> idx % code == code - 1 }
}