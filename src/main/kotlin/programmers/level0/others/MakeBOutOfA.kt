package programmers.level0.others

class MakeBOutOfA {
    fun solution(before: String, after: String): Int = if ( before.toList().sorted() == after.toList().sorted() ) 1 else 0
}