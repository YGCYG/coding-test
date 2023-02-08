package programmers.level0.others

class StringPush {
    fun solution(A: String, B: String): Int = rotate(A, B, 0)

    tailrec fun rotate(str: String, target: String, round: Int): Int {
        if ( round > str.length ) return -1

        return if ( str == target ) round
        else rotate( str.last() + str.slice(0 .. str.length-2), target, round + 1)
    }

//    진짜 생각지도 못한 코드가 있두라.. 에휴
//    fun solution(A: String, B: String): Int = (B + B).indexOf(A)
}