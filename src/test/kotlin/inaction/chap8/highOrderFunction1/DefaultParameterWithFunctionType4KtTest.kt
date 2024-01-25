package inaction.chap8.highOrderFunction1

import org.junit.jupiter.api.Test

class DefaultParameterWithFunctionType4KtTest {
    @Test
    fun testJoinToString() {
        val letters = listOf("Alpha", "Beta")
        assert(letters.joinToString() == "Alpha, Beta")
        assert(letters.joinToString { it.lowercase() } == "alpha, beta")
        assert(letters.joinToString(separator = "! ", postfix = "! ") { it.uppercase() } == "ALPHA! BETA! ")
    }
}