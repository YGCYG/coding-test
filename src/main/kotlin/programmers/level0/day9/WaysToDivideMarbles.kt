package programmers.level0.day9

import java.math.BigInteger

class WaysToDivideMarbles {
    fun solution(balls: Int, share: Int): Int = (factorial(balls, BigInteger("1"))/factorial(balls-share, BigInteger("1"))/factorial(share, BigInteger("1"))).toInt()

    tailrec fun factorial(n: Int, acc: BigInteger): BigInteger{
        return if (n <= 0) acc
        else factorial(n-1, n.toBigInteger() * acc)
    }
}