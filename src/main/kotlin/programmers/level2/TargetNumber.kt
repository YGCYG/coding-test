package programmers.level2

// 타겟 넘버
class TargetNumber {
    fun solution(numbers: IntArray, target: Int): Int =
        gen(numbers.toList(), target, 0)

    fun gen(nums: List<Int>, t: Int, acc: Int): Int =
        if ( nums.isEmpty()) { if ( t == acc ) 1 else 0 }
        else gen(nums.drop(1), t, acc + nums.first()) + gen(nums.drop(1), t, acc - nums.first())

}