package programmers.level0.day17

import java.lang.NullPointerException

class OXQuiz {
    fun solution(quiz: Array<String>): Array<String> =
        quiz.map { calculation(it.split(" ").filterNot { s -> s == "=" }) }
            .toTypedArray()

    fun calculation(list: List<String>): String {
        return try {
            val x = list[0].toInt()
            val op = list[1]
            val y = list[2].toInt()
            val z = list[3].toInt()

            when (op) {
                "+" -> if ( x + y == z ) "O" else "X"
                "-" -> if ( x - y == z ) "O" else "X"
                else -> "X"
            }
        } catch (e: NullPointerException) {
            return "X"
        }
    }
}