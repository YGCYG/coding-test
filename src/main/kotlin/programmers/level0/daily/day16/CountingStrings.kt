package programmers.level0.daily.day16

class CountingStrings {
    fun solution(my_string: String): Int =
        my_string.split(" ").let {
            it.foldIndexed(it[0].toInt()) { idx, acc, i ->
                when (i) {
                    "+" -> acc + it[idx + 1].toInt()
                    "-" -> acc - it[idx + 1].toInt()
                    else -> acc
                }
            }
        }
}