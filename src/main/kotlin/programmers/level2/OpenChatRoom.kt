package programmers.level2

// 오픈채팅방
class OpenChatRoom {
    fun solution(record: Array<String>): Array<String> {
        val users = hashMapOf<String, String>()

        return record.mapNotNull { rec ->
            val s = rec.split(" ")
            when (s[0]) {
                "Enter" -> {
                    users[s[1]] = s[2]
                    s[1] to "님이 들어왔습니다."
                }
                "Leave" -> {
                    s[1] to "님이 나갔습니다."
                }
                else -> {
                    users[s[1]] = s[2]
                    null
                }
            }
        }.map { users[it.first]+it.second }.toTypedArray()
    }
}