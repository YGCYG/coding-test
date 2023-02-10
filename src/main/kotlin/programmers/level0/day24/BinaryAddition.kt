package programmers.level0.day24

class BinaryAddition {
    fun solution(bin1: String, bin2: String): String = Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2))

    // toInt(2) 도 2진법임.
}