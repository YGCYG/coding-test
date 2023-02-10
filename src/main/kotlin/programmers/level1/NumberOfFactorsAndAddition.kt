package programmers.level1

// 약수의 개수와 덧셈
class NumberOfFactorsAndAddition {
   fun solution(left: Int, right: Int): Int {
        if (left < 1 || right < left || right > 1000) throw error("not in range")

        fun res(num: Int): Boolean {
            return ((1..num).filter { num % it == 0}.size % 2) == 0
        }

        return (left..right).fold(0) { acc, i -> if(res(i)) acc + i else acc - i}
    }
}