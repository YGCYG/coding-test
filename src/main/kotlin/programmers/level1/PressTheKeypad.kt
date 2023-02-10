package programmers.level1

// 키패드 누르기
class PressTheKeypad {
    fun solution(numbers: IntArray, hand: String): String {
        var left = -2
        var right = -3
        val handInit = if (hand == "left") "L" else "R"
        return numbers.mapIndexed { i, n ->
            when (n) {
                1, 4, 7 -> {
                    left = n
                    "L"
                }
                3, 6, 9 -> {
                    right = n
                    "R"
                }
                else -> {
                    if (getDist(left, n) > getDist(right, n)) {
                        right = n
                        "R"
                    } else if (getDist(left, n) < getDist(right, n)) {
                        left = n
                        "L"
                    } else {
                        when (handInit) {
                            "L" -> left = n
                            else -> right = n
                        }
                        handInit
                    }
                }
            }
        }.joinToString("")
    }

    fun getDist(num1: Int, num2: Int): Int {
        return when (num1) {
            1, 3 -> {
                when (num2) {
                    2 -> 1
                    5 -> 2
                    8 -> 3
                    0 -> 4
                    else -> -1
                }
            }
            4, 6 -> {
                when (num2) {
                    2 -> 2
                    5 -> 1
                    8 -> 2
                    0 -> 3
                    else -> -1
                }
            }
            7, 9 -> {
                when (num2) {
                    2 -> 3
                    5 -> 2
                    8 -> 1
                    0 -> 2
                    else -> -1
                }
            }
            -2, -3 -> {
                when (num2) {
                    2 -> 4
                    5 -> 3
                    8 -> 2
                    0 -> 1
                    else -> -1
                }
            }
            2 -> {
                when (num2) {
                    2 -> 0
                    5 -> 1
                    8 -> 2
                    0 -> 3
                    else -> -1
                }
            }
            5 -> {
                when (num2) {
                    2 -> 1
                    5 -> 0
                    8 -> 1
                    0 -> 2
                    else -> -1
                }
            }
            8 -> {
                when (num2) {
                    2 -> 2
                    5 -> 1
                    8 -> 0
                    0 -> 1
                    else -> -1
                }
            }
            0 -> {
                when (num2) {
                    2 -> 3
                    5 -> 2
                    8 -> 1
                    0 -> 0
                    else -> -1
                }
            }
            else -> -1
        }
    }
}