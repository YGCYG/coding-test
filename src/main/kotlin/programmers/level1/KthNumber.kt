package programmers.level1

// k번째 수
class KthNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { coms -> array.copyOfRange(coms[0]-1, coms[1]).sorted()[coms[2]-1] }.toIntArray()
    }
}