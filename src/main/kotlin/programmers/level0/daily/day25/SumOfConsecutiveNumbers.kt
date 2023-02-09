package programmers.level0.daily.day25

class SumOfConsecutiveNumbers {
    fun solution(num: Int, total: Int): IntArray {
        return if ( num % 2 == 1 ) (total/num-num/2..total/num+num/2).toList().toIntArray()
        else (total/num-num/2 + 1..total/num+num/2).toList().toIntArray()
    }
}