package programmers.level0.day22

class DeterminingFiniteDecimalNumbers {
    fun solution(a: Int, b: Int): Int {
        val denom = b/gcd(a,b)
        val range = (2..denom).filterNot { it % 2 == 0 || it % 5 == 0 }

        for (i in range) {
            if (denom % i == 0) return 2
        }

        return 1
    }

    tailrec fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}