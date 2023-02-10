package programmers.level1

// 삼총사
class TheThreeMusketeers {
    fun solution(number: IntArray): Int {
        val combList = mutableListOf<List<Int>>()
        comb(3, 0, number, Array<Boolean>(number.size){false}, combList)
        return combList.filter { it.sum() == 0 }.size
    }

    fun comb(target: Int, start: Int, elmt: IntArray, ck: Array<Boolean>, result: MutableList<List<Int>>) {
        if ( target == 0) {
            result.addAll(listOf(elmt.filterIndexed { idx, t -> ck[idx] }))
        } else {
            for ( i in start until elmt.size) {
                ck[i] = true
                comb(target-1, i+1, elmt, ck, result)
                ck[i] = false
            }
        }
    }
}