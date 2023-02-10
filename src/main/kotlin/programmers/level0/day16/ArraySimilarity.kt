package programmers.level0.day16

class ArraySimilarity {
    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.count { it in s2 }
}