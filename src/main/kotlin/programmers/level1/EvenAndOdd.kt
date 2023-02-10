package programmers.level1

// 짝수와 홀수
class EvenAndOdd {
    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }
}