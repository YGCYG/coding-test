package programmers.level2

// 할인 행사
class DiscountEvent {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val zip = want.zip(number.toList())
        return (0 .. discount.size - 10).count { count(zip, discount.slice(it until it+10)) }
    }

    fun count(wZip: List<Pair<String,Int>>, dList: List<String>): Boolean {
        for ( w in wZip) {
            if (dList.count { it == w.first } != w.second) return false
        }

        return true
    }
}