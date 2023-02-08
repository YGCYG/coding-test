package programmers.level0.daily.day20

class CharactersCoordinates {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var x = 0
        var y = 0
        val boardX = board[0]/2
        val boardY = board[1]/2

        keyinput.forEach {
            when (it) {
                "up" -> if ( y < boardY ) y++
                "down" -> if ( y != -boardY ) y--
                "left" -> if ( x != -boardX ) x--
                "right" -> if ( x < boardX ) x++
                else -> throw Exception()
            }
        }

        return intArrayOf(x, y)
    }
}