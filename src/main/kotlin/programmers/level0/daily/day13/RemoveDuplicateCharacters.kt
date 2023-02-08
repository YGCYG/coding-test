package programmers.level0.daily.day13

class RemoveDuplicateCharacters {
    fun solution(my_string: String): String {
        val mtList = mutableListOf<Char>()
        my_string.forEach { if (it in mtList) return@forEach else mtList.add(it)}

        return mtList.joinToString("")
    }

//    아오 그래 distinct가 있는데
//    fun solution(my_string: String): String = my_string.toList().distinct().joinToString("")
}