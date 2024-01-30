package inaction.chap9.genericTypeParameter1

val <T> List<T>.penultimate: T
    get() = this[size - 2]

/*
class SomeClass() {
//    val <T> x: T = TODO() // [COMPILE ERROR] Type parameter of a property must be used in its receiver type
}
*/
