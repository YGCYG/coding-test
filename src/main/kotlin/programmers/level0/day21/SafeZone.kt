package programmers.level0.day21

class SafeZone {
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        val dangerArea = Array(n) { Array(n) { 0 } }
        board.forEachIndexed { rIdx, row ->
            row.forEachIndexed { cIdx, col ->
                if ( col == 1 ) {
                    val left = if ( cIdx < 1 ) 0 else cIdx - 1
                    val right = if ( cIdx > n-2 ) n-1 else cIdx + 1
                    val upper = if ( rIdx < 1 ) 0 else rIdx - 1
                    val lower = if ( rIdx > n-2 ) n-1 else rIdx + 1

                    dangerArea[upper][left] = 1
                    dangerArea[rIdx][left]= 1
                    dangerArea[lower][left] = 1
                    dangerArea[upper][cIdx] = 1
                    dangerArea[rIdx][cIdx] = 1
                    dangerArea[lower][cIdx] = 1
                    dangerArea[upper][right] = 1
                    dangerArea[rIdx][right] = 1
                    dangerArea[lower][right] = 1
                }
            }
        }

        return dangerArea.map { it.count { i -> i == 0} }.sumOf { it }
    }
}