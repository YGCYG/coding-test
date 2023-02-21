package programmers.level1

// 카드 뭉치
class DeckOfCards {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String =
        if (check(cards1.toList(), cards2.toList(), goal.toList())) "Yes"
        else "No"

    tailrec fun check(cards1: List<String>, cards2: List<String>, goal: List<String>): Boolean =
        if (goal.isEmpty()) true
        else {
            when {
                cards1.isNotEmpty() && goal.first() == cards1.first() -> check(cards1.drop(1), cards2, goal.drop(1))
                cards2.isNotEmpty() && goal.first() == cards2.first() -> check(cards1, cards2.drop(1), goal.drop(1))
                else -> false
            }
        }
}