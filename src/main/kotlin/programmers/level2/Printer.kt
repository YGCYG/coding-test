package programmers.level2

// 프린터
class Printer {
    fun solution(priorities: IntArray, location: Int): Int =
        sort(priorities.mapIndexed { idx, p -> p to idx }, location, 1)

    tailrec fun sort(p: List<Pair<Int, Int>>, l: Int, acc: Int): Int =
        if ( p.first().first == p.maxOfOrNull { it.first } ) {
            if (p.first().second == l) acc
            else sort(p.drop(1), l, acc + 1)
        } else sort( p.drop(1) + p.first(), l, acc)
}