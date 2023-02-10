package programmers.level0.day20

class PolynomialAddition {
    fun solution(polynomial: String): String {
        val split = polynomial.split(" ").filterNot { it.contains("+")}
        val x = split.filter { it.contains("x") } .map { it.filterNot { c -> c == 'x' }.ifEmpty { "1" } }
        val v = split.filterNot { it.contains("x") }
        val xVal = x.sumOf { it.toInt() }.let { if (it == 1) "" else it }

        return if (v.isEmpty()) "${xVal}x"
        else if (x.isEmpty()) "${v.sumOf { it.toInt() }}"
        else "${xVal}x + ${v.sumOf { it.toInt() }}"
    }
}