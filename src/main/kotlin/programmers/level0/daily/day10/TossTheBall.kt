package programmers.level0.daily.day10

class TossTheBall {
    fun solution(numbers: IntArray, k: Int): Int {
        val rebuild =
            if ( numbers.size % 2 == 0) numbers.filter { it % 2 == 1 }
            else numbers.filter { it % 2 == 1 } + numbers.filter { it % 2 == 0 }

        return rebuild[(k-1) % rebuild.size]
    }

//    음.. 컨디션이 안좋나 왤케 돌아가지 오늘
//    fun solution(numbers: IntArray, k: Int): Int = numbers[(k - 1) * 2 % numbers.size]
}