package programmers.level1

// 서울에서 김서방 찾기
class FindKimseobangInSeoul {
    fun solution(seoul: Array<String>): String {
        if (seoul.size < 1 || seoul.size > 1000) throw error("not in range")

        return seoul.mapIndexedNotNull { idx, str -> if (str == "Kim") "김서방은 ${idx}에 있다" else null}.first().toString()
    }
}