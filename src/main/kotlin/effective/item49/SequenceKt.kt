package effective.item49

import inaction.chap5.Person

fun classicStatement() {
    for (e in listOf(1, 2, 3)) {
        print("F$e, ")
        if (e % 2 == 1) {
            print("M$e, ")
            val mapped = e * 2
            print("E$mapped, ")
        }
    }
}

fun seqSumFunc(): Int {
    return (1..1000)
        .asSequence()
        .map { it * 3 }
        .filter { it % 2 == 0 }
        .sum()
}


val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Chris", 32))
fun singleStepListPrecessing(): List<Person> = people.filter { it.age > 30 }
fun singleStepSequenceProcessing(): List<Person> = people.asSequence().filter { it.age >= 30 }.toList()

val fibonacciInfiniteSequence = sequence {
    yield(1)
    var current = 1
    var prev = 1
    while (true) {
        yield(current)
        val temp = prev
        prev = current
        current += temp
    }
}