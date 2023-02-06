package programmers.level0.daily.day10

class MakeIt2Dimensional {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> = (0 until num_list.size/n).map { num_list.sliceArray(n*it until n*(it+1)) }.toTypedArray()

//    chunked 라는게 있더라.. 정진하자.
//    fun solution(num_list: IntArray, n: Int)= num_list.toList().chunked(n)
}