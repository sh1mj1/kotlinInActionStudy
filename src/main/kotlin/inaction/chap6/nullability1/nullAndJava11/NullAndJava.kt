package inaction.chap6.nullability1.nullAndJava11

fun yellAt(person: Person) {
    println(person.name.uppercase() + "!!!")
}

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").uppercase() + "!!!")
}