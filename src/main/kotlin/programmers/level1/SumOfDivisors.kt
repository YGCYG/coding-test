package programmers.level1

// 약수의 합
class SumOfDivisors {
    fun solution(n: Int): Int {
        return if ( n == 0) 0 else (1..n).reduce { acc, i -> if (n % i == 0) acc + i else acc}
    }
}