package inaction.chap7.OverloadingComparisionOperator2

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class PersonTest {
    @Test
    fun testCompareToPerson() {
        val p1 = Person("Alice", "Smith")
        val p2 = Person("Bob", "Johnson")
        assertFalse { p1 < p2 }
    }
}