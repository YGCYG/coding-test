package programmers.level1

// 문자열 나누기
class SplitString {
    fun solution(s: String): Int {
        return countMatch(s, 0)
    }

    tailrec fun countMatch(s: String, i: Int): Int {
        if (s.length == 0) return i
        else if (s.length == 1) return i + 1
        else {
            val str = s[0]
            var countS = 0
            var countNS = 0
            s.forEachIndexed { idx, c ->
                if (str == c) countS += 1
                else countNS += 1

                if (countS == countNS) return countMatch(s.substring(idx + 1, s.length), i + 1)
            }

            return i + 1
        }
    }
}