package programmers.level1

// 소수 만들기
class MakingDecimals {
    fun solution(nums: IntArray): Int {
        val result = mutableListOf<List<Int>>()
        comb(3, 0, nums, Array(nums.size) {false}, result)
        return result.filter { isPrime(it.sum()) == true }.size
    }

    fun comb(target: Int, start: Int, elmnt: IntArray, ck: Array<Boolean>, result: MutableList<List<Int>>) {
        if ( target == 0) {
            result.addAll(listOf(elmnt.filterIndexed { idx, t -> ck[idx]}))
        } else  {
            for (i in start until elmnt.size) {
                ck[i] = true
                comb(target-1, i+1, elmnt, ck, result)
                ck[i] = false
            }
        }
    }

    fun isPrime(num: Int): Boolean {
        for (i in 2..kotlin.math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }

        return true
    }
}