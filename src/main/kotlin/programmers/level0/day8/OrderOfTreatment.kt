package programmers.level0.day8

class OrderOfTreatment {
    fun solution(emergency: IntArray): IntArray {
        val sorted = emergency.sortedArrayDescending()
        return emergency.map { sorted.indexOf(it) + 1 }.toIntArray()
    }
}