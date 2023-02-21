package programmers.level2

// 이진 변환 반복하기
class RepeatBinaryConversion {
    fun solution(s: String): IntArray = binConversion(s, 0, 0)

    tailrec fun binConversion(s: String, zeros: Int, count: Int): IntArray {
        return if (s == "1") intArrayOf(count, zeros)
        else binConversion(
            Integer.toBinaryString(s.filterNot { it == '0'}.length),
            zeros + s.count { it == '0' },
            count+1
        )
    }
}