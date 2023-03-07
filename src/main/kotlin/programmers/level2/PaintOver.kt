package programmers.level2

// 덧칠하기
class PaintOver {
    fun solution(n: Int, m: Int, section: IntArray): Int = draw(m, section.toList(), 0)

    fun draw(m:Int, sec: List<Int>, acc: Int): Int {
        return if ( sec.isEmpty()) acc
        else draw(m, sec.filterNot { it < sec.first() + m }, acc + 1)
    }
}