package inaction.chap5.lambdaWithReceiver5.with1

import org.junit.jupiter.api.Test

class WithKtTest {
    @Test
    fun testAlphabet() {
        assert(
            alphabet() == """
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                Now I know the alphabet
            """.trimIndent()
        )
        assert(
            alphabetUsingWith() == """
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                Now I know the alphabet
            """.trimIndent()
        )
        assert(
            alphabetFinal() == """
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                Now I know the alphabet
            """.trimIndent()
        )
    }
}