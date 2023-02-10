package programmers.level1

// 두 개 뽑아서 더하기
class PickTwoAndAddThem {
    fun solution(numbers: IntArray): IntArray {
        return mergeDistinctSort(*numbers.mapIndexed { idx1, num1 ->
            numbers.toList().mapIndexedNotNull { idx2, num2 ->
                if (idx2 == idx1) null else num2 + num1
            }
        }.toTypedArray())
    }

    fun mergeDistinctSort(vararg arrays: List<Int>): IntArray {
        val list = ArrayList<Int>()
        for (array in arrays) {
            list.addAll(array)
        }
        return list.distinct().sorted().toIntArray()
    }
}