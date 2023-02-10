package programmers.level1

// 신규 아이디 추천
class NewIDRecommendation {
    fun solution(new_id: String): String {
        val step1 = new_id.lowercase()
        val step2 = step1.filter {
            when (it) {
                in 'a'..'z' -> true
                in '0'..'9' -> true
                '-' -> true
                '_' -> true
                '.' -> true
                else -> false
            }
        }

        val step3 = step2.replace("[:.:]{2,}".toRegex(), ".")
        val step4_1 = if (step3.first() == '.') step3.drop(1) else step3
        val step4 = if (step4_1.length > 0) {
            if (step4_1.last() == '.') step4_1.dropLast(1) else step4_1
        } else step4_1

        val step5 = if (step4.length == 0 ) "a" else step4
        val step6_1 = if (step4.length > 15) step5.slice(0..14) else step5
        val step6 = if (step6_1.last() == '.') step6_1.dropLast(1) else step6_1

        val step7 = if (step6.length < 3) step6 + step6.last().toString().repeat(3-step6.length) else step6

        return step7
    }
}