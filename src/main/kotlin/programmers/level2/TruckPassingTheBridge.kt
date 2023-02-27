package programmers.level2

// 다리를 지나는 트럭
// 이건 다시 풀어보자...
class TruckPassingTheBridge {
    data class Status (
        val w: Int,
        var p: Int
    )

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val trucks = truck_weights.toMutableList()
        val queue = mutableListOf<Status>()
        var acc = 1

        while (true) {
            queue.forEach { it.p += 1}
            if ( queue.isNotEmpty() && queue.first().p >= bridge_length) queue.removeAt(0)
            if (trucks.isEmpty()) {
                if ( queue.isEmpty()) break
            } else {
                if ( queue.sumOf { it.w } + trucks.first() <= weight) {
                    queue.add(Status(trucks.first(), 0))
                    trucks.removeAt(0)
                }
            }

            acc += 1
        }

        return acc
    }
}