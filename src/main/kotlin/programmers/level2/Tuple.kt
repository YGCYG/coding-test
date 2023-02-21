package programmers.level2

// 튜플
class Tuple {
    fun solution(s: String): IntArray  =
        s.removePrefix("{{").removeSuffix("}}").split("},{")
            .map { it.split(",").map { s -> s.toInt() } }
            .sortedBy { it.size }
            .let { ss ->
                ss.reduceIndexed { idx, acc, lst ->
                    if (idx != 0) acc + lst.filterNot { it in ss[idx-1] }
                    else acc
                }
            }.toIntArray()
}