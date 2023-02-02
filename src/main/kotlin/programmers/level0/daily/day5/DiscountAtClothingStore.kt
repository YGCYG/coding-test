package programmers.level0.daily.day5

class DiscountAtClothingStore {
    fun solution(price: Int): Int = when (price) {
        in (10 until 100000) -> price
        in (100000 until 300000) -> (price * 0.95f).toInt()
        in (300000 until 500000) -> (price * 0.90f).toInt()
        else -> (price * 0.80f).toInt()
    }
}