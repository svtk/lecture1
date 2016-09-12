package collections

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    for (i in list) {
        println(i)
    }
    println(list.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList.javaClass)

    //read-only vs mutable
}
