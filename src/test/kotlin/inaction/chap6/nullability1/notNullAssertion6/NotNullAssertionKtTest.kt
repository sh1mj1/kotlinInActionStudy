package inaction.chap6.nullability1.notNullAssertion6

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NotNullAssertionKtTest {
    @Test
    fun testNotNullAssertion() {
        assertThrows<NullPointerException> { ignoreNulls(null) }
        // [런타임 ERROR] java.lang.NullPointerException
    }
}