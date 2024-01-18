package inaction.chap6.primitiveType2

data class Person(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

/*

val i = 1
val l: Long = i // [COMPILE ERROR] Type mismatch: inferred type is Int but Long was expected
val k: Long = i.toLong()

val a: Long = 1
val b: Int = a.toInt()

*/

fun foo(l: Long) = println(l)

