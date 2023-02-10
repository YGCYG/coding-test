package programmers.level1

// 최대공약수와 최소공배수
class GCFAndLCM {
    fun solution(n: Int, m: Int): IntArray {
        if ( n < 1 || n > 1000000 || m < 1 || m > 1000000) throw error("not in range")

        val gcd = gcd(n,m)
        return intArrayOf(gcd, (n*m)/gcd)

    }

    fun gcd(n: Int, m: Int): Int = if(m != 0) gcd(m, n%m) else n
}