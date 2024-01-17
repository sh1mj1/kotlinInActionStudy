package inaction.chap6.nullability1.safeCast4

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SafeCastTest {
    @Test
    fun testPerson() {
        val p1 = Person("Dmitry", "Jemrov")
        val p2 = Person("Dmitry", "Jemrov")
        assertTrue(p1 == p2)
        assertFalse(p1.equals(42))
    }
}