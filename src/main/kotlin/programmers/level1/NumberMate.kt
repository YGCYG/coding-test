package programmers.level1

// 숫자 짝꿍
class NumberMate {
    fun solution(X: String, Y: String): String {
        var result = ""

        (0..9).map { num ->
            val charN = Character.forDigit(num, 10)
            val x = X.count { it == charN }
            val y = Y.count { it == charN }
            if (x > y) result = charN.toString().repeat(y.toInt()) + result
            else result = charN.toString().repeat(x.toInt()) + result
        }

        return when {
            result == "" -> "-1"
            result[0] == '0' -> "0"
            else -> result
        }
    }
}