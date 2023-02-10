package programmers.level1

// 체육복
class GymSuit {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val clothes = (1..n).map {
            if (it in lost) {
                if (it in reserve) 1
                else 0
            }
            else if (it in reserve) 2
            else 1
        }.joinToString("")

        val check1 = clothes.replace("2020", "1111")
        val check2 = clothes.replace("0202", "1111")
        val max = if ( nonZeroCount(check1) > nonZeroCount(check2) ) check1 else check2

        val maxBorrow = max.replace("20", "11").replace("02", "11")

        return nonZeroCount(maxBorrow)
    }

    fun nonZeroCount(str: String): Int = str.toCharArray().count { it != '0' }
}