package programmers.level1

// 성격 유형 검사하기
class AssessPersonalityType {
   fun solution(survey: Array<String>, choices: IntArray): String {
        var sumArr = mutableListOf(0,0,0,0)
        val set1 = listOf("R", "C", "J", "A")
        val set2 = listOf("T", "F", "M", "N")

        survey.forEachIndexed { idx, s ->
            val value = choices[idx] - 4
            when (s) {
                "RT" -> sumArr[0] += value
                "TR" -> sumArr[0] -= value
                "CF" -> sumArr[1] += value
                "FC" -> sumArr[1] -= value
                "JM" -> sumArr[2] += value
                "MJ" -> sumArr[2] -= value
                "AN" -> sumArr[3] += value
                "NA" -> sumArr[3] -= value
                else -> throw Exception()
            }
        }

        return sumArr.mapIndexed { idx, s ->
            if (s <= 0) set1[idx] else set2[idx]
        }.joinToString("")
    }
}