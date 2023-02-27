package programmers.level2

// 2개 이하로 다른 비트
class NoMoreThan2DifferentBits {
    fun solution(numbers: LongArray): LongArray =
        numbers.map {
            val str = it.toString(2)
            when (val idx = str.lastIndexOf('0')) {
                -1 -> "10" + str.drop(1)
                str.length - 1 -> str.dropLast(1) + '1'
                else -> str.substring(0 until idx) + "10" + str.substring(idx+2 until str.length)
            }
        }.map { it.toLong(2) }.toLongArray()


//    shr shl ... 쉬프트 연산자 저번에도 봤는데 왜 생각이 안날까?
//    inv(): 비트 반전
//    fun solution(numbers: LongArray): LongArray {
//        return numbers.map { num -> (num.inv() and num + 1).let { num or it and (it shr 1).inv() } }.toLongArray()
//    }
}