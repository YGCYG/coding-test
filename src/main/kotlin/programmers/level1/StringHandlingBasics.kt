package programmers.level1

// 문자열 다루기 기본
class StringHandlingBasics {
    fun solution(s: String): Boolean {
        if (s.length < 1 || s.length > 8) throw error("not in range")
        else if (s.length < 4 || s.length > 6 || s.length == 5) return false

        return if ( s.filterNot { (it - '0') in (0..9) }.length == 0 ) true else false
    }
}