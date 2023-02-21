package programmers.level2

// n^2 배열 자르기
class CropN2Array {
    fun solution(n: Int, left: Long, right: Long): IntArray =
        (left..right).map {
            if ( it / n > it % n) (it / n).toInt() + 1
            else (it % n).toInt() + 1
        }.toIntArray()
}