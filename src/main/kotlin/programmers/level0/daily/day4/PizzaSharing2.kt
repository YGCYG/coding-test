package programmers.level0.daily.day4

class PizzaSharing2 {
    fun solution(n: Int): Int = n / gcd(6, n)

    tailrec fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}