package effective.item13

fun keyIsCorrect(key: String): Boolean = key == "key"

fun useKeyIsCorrect(): Boolean {
    if (!keyIsCorrect("key")) {
        return true
    }
    return false
}

fun verifyKey(key: String): Unit? {
    if (key != "key") return null
    return Unit
}

fun useVerifyKey(): Boolean {
    verifyKey("key") ?: return false
    return true
}

