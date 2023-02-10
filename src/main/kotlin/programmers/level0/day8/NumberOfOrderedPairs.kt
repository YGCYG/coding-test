package programmers.level0.day8

class NumberOfOrderedPairs {
    fun solution(n: Int): Int {
        var count: Int = 0
        for ( i in 1..n) {
            for ( k in 1..n) {
                if ( i * k == n ) count++
                else if ( i * k > n ) break
                else continue
            }
        }
        return count
    }
}