package programmers.level1

// 옹알이 (2)
class Babbling2 {
    fun solution(babbling: Array<String>): Int {
        return babbling.map {
            val check = it.replace("aya", ".")
                .replace("ye", ".")
                .replace("woo", ".")
                .replace("ma", ".")

            if (check.filterNot{c->c =='.'}.length == 0) {
                when {
                    it.contains("ayaaya") -> 0
                    it.contains("yeye") -> 0
                    it.contains("woowoo") -> 0
                    it.contains("mama") -> 0
                    else -> 1
                }
            } else 0

        }.sum()
    }
}