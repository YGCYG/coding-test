package programmers.level1

// 나머지가 1이 되는 수 찾기
class FindNumberWhoseRemainderIs1 {
    fun solution(n: Int): Int {
        if (n < 3 || n > 1000000) throw error("not in range")
        return (2..n-1).filter { n % it == 1}.first()
    }
}