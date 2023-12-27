package effective.item5


fun speak(text: String) {
    check(isInitialized)
    // ...
}

fun getUserInfo(): UserInfo {
    checkNotNull(token)
    // ....
    return UserInfo()
}

/*
fun next(): T {
    check(isOpen)
    // ................
}
 */


val isInitialized: Boolean
    get() = true

val token: String?
    get() = "someToken"

val isOpen: Boolean
    get() = true

data class UserInfo(val name: String = "NAME")
