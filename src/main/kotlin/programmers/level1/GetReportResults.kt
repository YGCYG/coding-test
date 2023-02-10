package programmers.level1

// 신고 결과 받기
class GetReportResults {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val reportedMap = report.fold(mutableMapOf<String, List<String>>()) { acc, curr ->
            val splits = curr.split(" ")
            acc.merge(splits[1], listOf(splits[0])) { new, old -> (new + old).distinct() }
            acc
        }

        val filterd = reportedMap.filter { it.value.size >= k }

        val result = id_list.map { id ->
            var count = 0
            filterd.forEach { f ->
                if (f.value.contains(id)) count++
            }

            count
        }

        return result.toIntArray()
    }
}