package effective.item39.sealed

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ValueMatcherTest {

    @Test
    fun testEqualMatcher() {
        val valueMatcher = ValueMatcher.Equal(5)
        assertTrue(valueMatcher.match(5))
    }

    @Test
    fun testNotEqualMatcher() {
        val valueMatcher = ValueMatcher.NotEqual(5)
        assertTrue(valueMatcher.match(3))
    }

    @Test
    fun testEmptyListMatcher() {
        val valueMatcher = ValueMatcher.EmptyList(listOf<Int>())
        assertTrue(valueMatcher.match(listOf()))
    }

    @Test
    fun testNotEmptyListMatcher() {
        val valueMatcher = ValueMatcher.NotEmptyList(listOf<Int>())
        assertTrue(valueMatcher.match(listOf(1, 2, 3)))
    }

    @Test
    fun testReversed(){
        val valueMatcher = ValueMatcher.Equal(5)
        val result = valueMatcher.reversed()
        assert(result is ValueMatcher.NotEqual)
    }
}
