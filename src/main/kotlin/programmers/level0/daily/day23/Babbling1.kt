package programmers.level0.daily.day23

class Babbling1 {
    fun solution(babbling: Array<String>): Int =
        babbling.map {
            it.replace("aya", "/")
                .replace("ye", "/")
                .replace("woo", "/")
                .replace("ma", "/")
        }.count { it.all { c -> c == '/' } }
}