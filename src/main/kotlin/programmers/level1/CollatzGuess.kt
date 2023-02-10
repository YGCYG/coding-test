package programmers.level1

// 콜라츠 추측
class CollatzGuess {
    fun solution(num: Int): Int {
        if ( num < 1 || num > 8000000) throw error("not in range")
        tailrec fun rec(n: Int, r: Int): Int {
            return when {
                n == 1 -> r
                n % 2 == 0 -> rec(n/2, r+1)
                n % 2 == 1 -> rec((n*3 + 1), r+1)
                else -> -1
            }
        }

        val ret = rec(num, 0)
        return if (ret > 500) -1 else ret
    }
}