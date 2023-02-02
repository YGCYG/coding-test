package programmers.level0.daily.day6

class PrintRightTriangle {
    fun main(args: Array<String>) {
        val (n) = readLine()!!.split(' ').map(String::toInt)
        (1..n).forEach { println("*".repeat(it)) }
    }
}