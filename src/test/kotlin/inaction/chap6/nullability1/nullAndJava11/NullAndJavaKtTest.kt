package inaction.chap6.nullability1.nullAndJava11

import org.junit.jupiter.api.Test

class NullAndJavaKtTest {
    @Test
    fun testYellAt() {
        yellAt(Person(null))
    }

    @Test
    fun testYellAtSafe() {
        yellAtSafe(Person(null))
    }
}