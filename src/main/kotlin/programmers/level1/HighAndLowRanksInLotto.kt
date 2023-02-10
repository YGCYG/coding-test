package programmers.level1

// 로또의 최고 순위와 최저 순위
class HighAndLowRanksInLotto {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val poss = lottos.filter { it != 0 }
        val check = poss.mapNotNull { num -> win_nums.find { it == num } }

        val max = if (poss.size - check.size == 6) 6  else 1 + poss.size - check.size
        val min = if (check.size <= 1) 6 else 7 - check.size

        return listOf (max, min).toIntArray()
    }
}