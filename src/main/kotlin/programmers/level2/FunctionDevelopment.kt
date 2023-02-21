package programmers.level2

// 기능개발
class FunctionDevelopment {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray =
        deploy(progresses.toList(), speeds.toList(), listOf()).toIntArray()

    tailrec fun deploy(progresses: List<Int>, speeds: List<Int>, acc: List<Int>): List<Int> =
        if (progresses.isEmpty()) acc
        else {
            val next = progresses.zip(speeds).map { it.first + it.second }
            if (next.first() < 100) deploy(next, speeds, acc)
            else {
                val c = count(next, 0)
                deploy(next.subList(c, next.size), speeds.subList(c, speeds.size), acc + c)
            }
        }

    tailrec fun count(list: List<Int>, acc: Int): Int =
        if ( list.isEmpty() || list.first() < 100) acc
        else count(list.drop(1), acc + 1)
}