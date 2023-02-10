package programmers.level0.day24

class MakeBOutOfA {
    fun solution(before: String, after: String): Int = if ( before.toList().sorted() == after.toList().sorted() ) 1 else 0
}