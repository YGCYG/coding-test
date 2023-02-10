package programmers.level1

// 문자열을 정수로 바꾸기
class ConvertStringToInteger {
    fun solution(s: String): Int {
        if ( s.length < 1 || s.length > 5 ) throw error("not in range")
        return s.toInt()
    }
}