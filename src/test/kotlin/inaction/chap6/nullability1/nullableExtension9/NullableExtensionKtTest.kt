package inaction.chap6.nullability1.nullableExtension9

import org.junit.jupiter.api.Test

class NullableExtensionKtTest {
    @Test
    fun testNullOrBlank() {
        verifyUserInput(null) // 예외 발생 안 함
        verifyUserInput("  ")
    }

    @Test
    fun testNullOrBlankNormal() {
        verifyUserInputNormal(null)
    }
}