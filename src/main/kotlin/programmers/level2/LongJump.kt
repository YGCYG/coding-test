package programmers.level2

import java.math.BigInteger

// 멀리 뛰기
class LongJump {
    fun solution(n: Int): Long = sum(n, 0, BigInteger("0")).toLong()

    fun sum(one: Int, two: Int, acc: BigInteger): BigInteger {
        val bigOne = BigInteger("1")
        return if (one < 0) acc % BigInteger("1234567")
        else sum(one-2, two+1, acc + (fact(one+two, bigOne)/fact(one, bigOne)/fact(two, bigOne)))
    }

    tailrec fun fact(n: Int, acc: BigInteger): BigInteger{
        return if (n <= 0) acc
        else fact(n-1, n.toBigInteger() * acc)
    }

//     이게 피보나치 였네...
//    fun solution(n: Int): Long = getFibonacci(n + 1)
//    private tailrec fun getFibonacci(currentNumber : Int, acc : Long = 0, prevSum : Long = 1) : Long =
//        if(currentNumber == 0) acc
//        else getFibonacci(currentNumber - 1, prevSum, (prevSum + acc) % 1234567)
}