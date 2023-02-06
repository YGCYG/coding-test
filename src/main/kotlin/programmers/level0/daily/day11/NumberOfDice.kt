package programmers.level0.daily.day11

class NumberOfDice {
    fun solution(box: IntArray, n: Int): Int = box.map { it/n }.run { this[1] * this[2] * this[3] }

//    fold를 왜 자꾸 생각 못하니~
//    fun solution(box: IntArray, n: Int): Int = box.map { it / n }.fold(1){ acc, i -> acc * i }
}