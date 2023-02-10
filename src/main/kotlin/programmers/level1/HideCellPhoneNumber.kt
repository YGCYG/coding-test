package programmers.level1

// 핸드폰 번호 가리기
class HideCellPhoneNumber {
    fun solution(phone_number: String): String {
        val len = phone_number.length
        if (len < 4 || len > 20) throw error("not in range")
        return "*".repeat(len-4) + phone_number.substring(len-4, len)
    }
}