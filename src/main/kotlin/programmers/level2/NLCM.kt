package programmers.level2

// N개의 최소공배수
class NLCM {
    fun solution(arr: IntArray): Long = nlcm(arr.map { it.toLong()} )

    tailrec fun nlcm(list: List<Long>): Long {
        println("LCM: $list")
        return if ( list.size < 2) list.first()
        else nlcm(list.chunked(2).map {
            if (it.size < 2) it.first()
            else lcm(it.first(), it.last())
        })
    }

    fun lcm(a: Long, b: Long): Long = a*b/gcd(a,b)
    tailrec fun gcd(a: Long, b:Long): Long = if(b != 0L) gcd(b, a % b) else a
}