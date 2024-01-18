package effective.item3

fun statedType() {
    val value: String = JavaClass().value // java.lang.NullPointerException: getValue(...) must not be null
    println("foo")
    println(value.length)
}

fun platformType() {
    val value = JavaClass().value
    println("foo")
    println(value.length) // java.lang.NullPointerException: Cannot invoke "String.length()" because "value" is null
}