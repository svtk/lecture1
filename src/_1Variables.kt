package variables

fun main(args: Array<String>) {
    // read-only
    val question: String =
            "life, the universe, " +
                    "and everything"
    println("$question?")

    // mutable
    var answer: Int = 0
    answer = 42
    println(answer)

    // it's type is fixed
//    answer = "no answer"

    // it's a read-only reference, not a read-only object
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
}