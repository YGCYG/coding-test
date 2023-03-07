import programmers.level2.MakeBigNumbers

fun main(args: Array<String>) {
    val test1 = MakeBigNumbers().solution("1924", 2)
    val test2 = MakeBigNumbers().solution("1231234", 3)
    val test3 = MakeBigNumbers().solution("4177252841", 4)
    val test4 = MakeBigNumbers().solution("04177252841", 5)

    println(test1)
    println(test2)
    println(test3)
    println(test4)
}
