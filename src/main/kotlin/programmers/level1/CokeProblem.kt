package programmers.level1

// 콜라 문제
class CokeProblem {
    fun solution(a: Int, b: Int, n: Int): Int {
        return if (a < b) 0 else exchange(a,b,n)
    }

    fun exchange(a: Int, b: Int, n: Int): Int {
        val ret = b*(n/a)
        val have = ret + n%a

        return if ( ret < 1) 0 else ret + exchange(a, b, have)
    }
}