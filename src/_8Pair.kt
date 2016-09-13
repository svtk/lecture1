package pair

fun functionReturningPair() = Pair(42, "answer")

fun main(args: Array<String>) {
    val (i, s) = functionReturningPair()
    println(i)
}
