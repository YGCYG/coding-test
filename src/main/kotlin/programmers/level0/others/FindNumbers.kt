package programmers.level0.others

class FindNumbers {
    fun solution(num: Int, k: Int): Int {
        val toStr = num.toString()
        for ( i in toStr.indices) {
            if (toStr[i] == k.digitToChar()) return i + 1
        }

        return -1
    }
}