package inaction.chap5.lambdaWithReceiver5.apply2

import org.junit.jupiter.api.Test

class ApplyKtTest {
    @Test
    fun testAlphabet() {
        assert(
            alphabetUsingApply() == """
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                Now I know the alphabet
            """.trimIndent()
        )
        assert(
            alphabetUsingBuildString() == """
                ABCDEFGHIJKLMNOPQRSTUVWXYZ
                Now I know the alphabet
            """.trimIndent()
        )
    }
}