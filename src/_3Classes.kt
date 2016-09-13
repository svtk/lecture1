package classes

// the compiled version is the same as java.Person

class Person(val name: String, var age: Int)

fun main(args: Array<String>) {
    // no new keyword
    val person = Person("Alice", 26)

    println(person.name)
}