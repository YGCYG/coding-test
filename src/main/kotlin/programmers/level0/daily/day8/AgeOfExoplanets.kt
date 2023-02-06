package programmers.level0.daily.day8

class AgeOfExoplanets {
    fun solution(age: Int): String = age.toString().map { (it.digitToInt() + 'a'.code).toChar() }.joinToString("")
}