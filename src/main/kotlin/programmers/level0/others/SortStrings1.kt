package programmers.level0.others

class SortStrings1 {
   fun solution(my_string: String): IntArray = my_string.mapNotNull { if (it.isDigit()) it.digitToInt() else null }.toIntArray()
}