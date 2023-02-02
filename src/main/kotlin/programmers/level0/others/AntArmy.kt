package programmers.level0.others

class AntArmy {
    fun solution(hp: Int): Int {
        val gen = hp / 5
        val sol = (hp % 5) / 3

        return hp - gen*4 - sol*2
    }

}