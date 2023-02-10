package programmers.level1

// 직사각형 별찍기
class RectangularStar {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        val strA = "*".repeat(a) + "\n"
        println(strA.repeat(b))
    }
}