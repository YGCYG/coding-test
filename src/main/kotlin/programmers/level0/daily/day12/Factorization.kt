package programmers.level0.daily.day12

class Factorization {
   fun solution(n: Int): IntArray = factorize(n, intArrayOf()).distinct().toIntArray()

    tailrec fun factorize(n: Int, list: IntArray): IntArray {
        for (i in 2..n) {
            if ( n % i == 0) return factorize(n/i, list + i)
        }

        return list
    }
}