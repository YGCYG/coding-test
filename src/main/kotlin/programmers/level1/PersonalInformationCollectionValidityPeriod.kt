package programmers.level1

import java.text.SimpleDateFormat
import java.util.Calendar

// 개인정보 수집 유효기간
class PersonalInformationCollectionValidityPeriod {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val formatter = SimpleDateFormat("yyyy.MM.dd")

        val termsToMap = terms.map {
            val splits = it.split(" ")
            splits[0] to splits[1]
        }.toMap()

        return privacies.mapIndexedNotNull { idx, p ->
            val splits = p.split(" ")

            val toDate = Calendar.getInstance()
            val dDate = Calendar.getInstance()
            toDate.time = formatter.parse(today)
            dDate.time = formatter.parse(splits[0])

            val term = termsToMap[splits[1]] ?: throw Exception()
            dDate.add(Calendar.MONTH, term.toInt())
            if ( toDate >= dDate ) idx + 1 else null
        }.toIntArray()
    }
}