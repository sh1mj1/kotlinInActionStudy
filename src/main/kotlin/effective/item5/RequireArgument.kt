package effective.item5

import kotlin.math.log


fun factorial(n: Int): Long {
    require(n >= 0) {
        "Cannot calculate factorial of  $n " +
                "because it is smaller than 0"
    }
    return if (n <= 1) 1 else factorial(n - 1) * n
}

fun sendEmail(user: User, message: String) {
    requireNotNull(user.email)
    require(isValidEmail(user.email))
    // ...
}

fun isValidEmail(email: String): Boolean {
    /* ... */
    return email.startsWith("aa")
}

// 스마트 캐스팅
fun changeDress(person: Person) {
    require(person.outfit is Dress)
    val dress: Dress = person.outfit
    // ...
}

fun sendEmail(person: Person) {
    requireNotNull(person.email)
    val email: String = person.email
    println(email)
    // .......
}

fun sendEmail(person: Person, text: String) {
    val email: String = person.email ?: run {
        println("Email not sent, no email address")
        return
    }
    println(email + text)
    // ...
}

data class User(val email: String) {
    init {
        require(email.startsWith("x"))
    }
}

data class Person(val outfit: Outfit, val email: String?)
interface Outfit
class Dress : Outfit
class Jacket : Outfit
