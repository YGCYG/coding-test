package programmers.level1

// 크레인 인형뽑기 게임
class CraneCatchGame {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val basket = mutableListOf<Int>()
        val index = (0 until board.size).mapIndexed { i1, x ->
            val head = board.map { it[i1] }
            head.withIndex().first {it.value != 0}.index
        }.toMutableList()

        val result = mutableListOf<Int>()
        var removed = 0

        moves.forEach { m ->
            if (index[m-1] != -1) {
                if (result.size > 0) {
                    if (result[result.size-1] == board[index[m-1]][m-1]) {
                        result.removeAt(result.size-1)
                        removed += 2
                    } else {
                        result.add(board[index[m-1]][m-1])
                    }
                } else {
                    result.add(board[index[m-1]][m-1])
                }
                index[m-1] = if (index[m-1] + 1 > board.size-1) -1 else index[m-1] + 1
            }
        }

        return removed

    }
}