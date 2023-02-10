package programmers.level1

// 부족한 금액 계산하기
class CalculateTheShortfall {
    fun solution(price: Int, money: Int, count: Int): Long {
        if ( price < 1 || price > 2500 || money < 1 || money > 1000000000 || count < 1 || count > 2500)
            throw error("not in range")
        val res = (1..count).fold(0L) { acc, c -> acc + (price * c)} - money
        return if (res > 0) res else 0
    }
}