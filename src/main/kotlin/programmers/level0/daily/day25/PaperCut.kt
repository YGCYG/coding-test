package programmers.level0.daily.day25

class PaperCut {
    fun solution(M: Int, N: Int): Int = if ( M < N ) (M-1) + M*(N-1) else (N-1) + (M-1)*N

//    ㅋㅋㅋ 아니 계산식을 좀 늘여봐... MN - 1 인데 왜이리 복잡하니..
}