package programmers.level1

// 음양 더하기
class PlusYinYang {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        if (absolutes.size < 1 || absolutes.size > 1000) throw error("not in range")

        return absolutes.mapIndexed { idx, v -> v * (if (signs[idx]) 1 else -1)}.sum()
    }
}