package programmers.level0.day19

class CutAndStoreAsArray {
    fun solution(my_str: String, n: Int): Array<String> = my_str.chunked(n).toTypedArray()
}