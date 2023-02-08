package programmers.level0.daily.day13

class CtrlZ {
    // 잘 보이게 정리좀 해야하는데...
    fun solution(s: String): Int = s.split(" ").let { it.foldIndexed(0) { idx, acc, i -> if (i == "Z") acc - it[idx-1].toInt() else acc + i.toInt()}}
}