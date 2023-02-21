package programmers.level2

// 괄호 회전하기
class RotateParenthesis {
    fun solution(s: String): Int {
        val s2 = s + s
        var count = 0

        for (i in 0 until s2.length-s.length) {
            if ( remove(s2.substring(i until i + s.length))) count++
        }

        return count
    }

    tailrec fun remove(str: String): Boolean {
        return if ( str.isEmpty() ) true
        else {
            val removed = str.replace("()", "").replace("{}", "").replace("[]", "")
            if ( str.length == removed.length ) false
            else remove(removed)
        }
    }
}