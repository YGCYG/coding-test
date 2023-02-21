package programmers.level2

// 피보나치
class FibonacciNumbers {
    fun solution(n: Int): Long = fibo(n, 0L, 1L) % 1234567

    tailrec fun fibo(n: Int, prev: Long, acc: Long): Long {
        return if (n < 1) prev
        else fibo(n-1, acc % 1234567, (prev + acc) % 1234567)
    }
}