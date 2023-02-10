package programmers.level1

// 2016년
class Year2016 {
    fun solution(a: Int, b: Int): String {
        val day = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val dayOfMonth = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        val days = dayOfMonth.subList(0, a-1).sum() + b + 4

        return day[days%7]
    }
}