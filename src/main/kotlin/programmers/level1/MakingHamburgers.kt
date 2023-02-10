package programmers.level1

// 햄버거 만들기
class MakingHamburgers {
    fun solution(ingredient: IntArray): Int {
        val q = mutableListOf<Int>()
        var count = 0

        ingredient.forEach {
            q.add(it)
            if (q.size < 4) return@forEach
            else {
                if (q.slice(q.size-4..q.size-1) == listOf(1,2,3,1)) {
                    for (i in 1..4) {
                    	q.removeLast()
                    }
                    count++
                }
            }

        }

        return count
    }
}