package inaction.chap9.variance3

open class Animal {
    fun feed() {

    }
}

class Herd<out T : Animal> {
    val size: Int get() = 10
    operator fun get(i: Int): T {
        return TODO("Provide the return value")
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0..<animals.size) {
        animals[i].feed()
    }
}

class Cat : Animal() {
    fun cleanLitter() {

    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0..<cats.size) {
        cats[i].cleanLitter()
        feedAll(cats) // [COMPILE ERROR] Type mismatch: inferred type is Herd<Cat> but Herd<Animal> was expected
    }
}