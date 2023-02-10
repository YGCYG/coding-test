package programmers.level1

// 최소직사각형
class LeastRectangle {
    fun solution(sizes: Array<IntArray>): Int {

        val rerange = sizes.map { if ( it.first() > it.last() ) it else it.reversedArray() }
        val x = rerange.map { it.first() }.maxOrNull() ?: 0
        val y = rerange.map { it.last() }.maxOrNull() ?: 0
        return x * y
    }
}