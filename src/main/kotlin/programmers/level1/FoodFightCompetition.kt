package programmers.level1

// 푸드 파이트 대회
class FoodFightCompetition {
    fun solution(food: IntArray): String {
        val half = getString(food.drop(1), 1)
        return half.reversed() + "0" + half
    }

    fun getString(food: List<Int>, idx: Int): String {
        return if (food.size < 1) "" else getString(food.drop(1), idx + 1) + idx.toString().repeat(food[0]/2)
    }

}