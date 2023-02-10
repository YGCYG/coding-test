package programmers.level1

// 가운데 글자 가져오기
class GetMiddleLetter {
    fun solution(s: String): String {
        if ( s.length < 1 || s.length > 100) throw error("not in range")
        val len = s.length / 2
        return if ( s.length % 2 == 0) s.substring(len-1, len+1) else s.substring(len,len+1)
    }
}