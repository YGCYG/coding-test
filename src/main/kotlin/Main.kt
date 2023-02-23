import programmers.level2.DiscountEvent

fun main(args: Array<String>) {
    val test1 = DiscountEvent().solution(
        arrayOf("banana", "apple", "rice", "pork", "pot"),
        intArrayOf(3, 2, 2, 2, 1),
        arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
    )
    val test2 = DiscountEvent().solution(
        arrayOf("apple"),
        intArrayOf(10),
        arrayOf("banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana")
    )
    println(test1)
    println(test2)
}
