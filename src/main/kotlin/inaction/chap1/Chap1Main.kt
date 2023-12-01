package inaction.chap1

fun main() {
    val persons = listOf(
        Person("영희"),
        Person("철수", age = 29)
    )
    val oldest = persons.maxBy { it.age ?: 0 }
    println("oldest: $oldest")
}