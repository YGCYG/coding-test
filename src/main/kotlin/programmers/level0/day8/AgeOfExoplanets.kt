package programmers.level0.day8

class AgeOfExoplanets {
    fun solution(age: Int): String = age.toString().map { (it.digitToInt() + 'a'.code).toChar() }.joinToString("")
}