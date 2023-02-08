package programmers.level0.daily.day2

class Addition2 {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val numer = (numer1 * denom2 + numer2 * denom1)
        val denom = denom1 * denom2
        val ndGCD = gcd(numer, denom)

        return intArrayOf(numer/ndGCD, denom/ndGCD)
    }

    tailrec fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}