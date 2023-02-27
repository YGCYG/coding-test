package programmers.level2

// 모음 사전
class VowelDictionary {
    fun solution(word: String): Int =
        word.let { if (it.length < 5) word + " ".repeat(5-it.length) else it }
            .reversed()
            .foldIndexed(0) { idx, acc, c ->
                val i = "AEIOU".indexOf(c)
                if (i == -1) acc + multiple(idx+1, 0, 0)
                else acc + i*multiple(idx+1, 1, 0) + 1
            }

    fun multiple(n: Int, b:Int, acc: Int): Int {
        return if (n < 1) acc
        else multiple(n-1, b, acc*5 + b)
    }
}