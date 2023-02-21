package programmers.level2

// 위장
class Camouflage {
    fun solution(clothes: Array<Array<String>>): Int =
        clothes.groupBy { it[1] }
            .values
            .fold(1) { acc, i -> acc * (i.size + 1)} - 1
}