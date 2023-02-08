package programmers.level0.daily.day21

class AdditionOfHiddenNumbers2 {
    fun solution(my_string: String): Int =
        my_string.replace("[a-zA-Z]".toRegex(), "/")
            .split("/").sumOf { it.replace("/", "").toIntOrNull() ?: 0 }

//    split도 regex가 가능하다..
//    fun solution(my_string: String): Int  =
//    my_string.split("[A-z]+".toRegex())
//        .filter(String::isNotEmpty)
//        .sumOf(String::toInt)
}