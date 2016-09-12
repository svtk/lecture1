package controlStructures

fun whileLoop() {
    fun condition() = true

    while (condition()) {
        /*...​*/
    }

    do {
        /*...​*/
    } while (condition())
}


fun forLoop() {
    for (i in 1..9) { // including
        print(i)
    }

    for (i in 1 until 10) { // excluding
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun main(args: Array<String>) {
    forLoop()
}