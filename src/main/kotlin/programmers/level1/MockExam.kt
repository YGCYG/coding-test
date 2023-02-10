package programmers.level1

// 모의고사
class MockExam {
    fun solution(answers: IntArray): IntArray {
        val first = answers.filterIndexed { idx, a -> a == listOf(1,2,3,4,5)[idx%5]}.size
        val second = answers.filterIndexed { idx, a -> a == listOf(2,1,2,3,2,4,2,5)[idx%8]}.size
        val third = answers.filterIndexed { idx, a -> a == listOf(3,3,1,1,2,2,4,4,5,5)[idx%10]}.size

        val list = listOf(first, second, third)
        val max = list.sorted().last()

        return listOf(1,2,3).zip(list).filter { it.second >= max }.map { it.first }.sorted().toIntArray()
    }
}