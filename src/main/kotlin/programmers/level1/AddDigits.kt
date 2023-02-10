package programmers.level1

// 자릿수 더하기
class AddDigits {
    fun solution(n: Int): Int {

        return when {
            n >= 10 -> n % 10 + solution(n/10)
            n > 0 && n < 10 -> n
            else -> 0
        }
    }
}