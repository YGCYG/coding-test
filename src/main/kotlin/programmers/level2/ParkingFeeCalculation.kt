package programmers.level2

import kotlin.math.ceil

// 주차 요금 계산
class ParkingFeeCalculation {
     fun solution(fees: IntArray, records: Array<String>): IntArray =
         records.map { it.split(" ") }
             .groupBy { it[1] }
             .map { it.key to it.value.sortedBy { v -> v[0] }}
             .map { t -> t.first to
                     t.second.chunked(2).sumOf { t2 ->
                         if (t2.size < 2) "23:59".toMin() - t2[0][0].toMin()
                         else t2[1][0].toMin() - t2[0][0].toMin()
                     } }
             .sortedBy { it.first }
             .map {
                 if (it.second > fees[0])
                     fees[1] + ceil((it.second - fees[0]).toDouble()/fees[2]).toInt()*fees[3]
                 else fees[1]
             }.toIntArray()

    fun String.toMin(): Int = this.split(":").fold(0) { acc, s -> acc * 60 + s.toInt()}
}

