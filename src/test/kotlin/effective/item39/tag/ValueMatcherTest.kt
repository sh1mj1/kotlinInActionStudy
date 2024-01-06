package effective.item39.tag

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ValueMatcherTest {

    @Test
    fun testEqualMatcher() {
        val valueMatcher = ValueMatcher.equal(5)
        assertTrue(valueMatcher.match(5))
    }

    @Test
    fun testNotEqualMatcher() {
        val valueMatcher = ValueMatcher.notEqual(5)
        assertTrue(valueMatcher.match(3))
    }

    @Test
    fun testEmptyListMatcher() {
        val valueMatcher = ValueMatcher.emptyList<List<Int>>()
        assertTrue(valueMatcher.match(listOf()))
    }

    @Test
    fun testNotEmptyListMatcher() {
        val valueMatcher = ValueMatcher.notEmptyList<List<Int>>()
        assertTrue(valueMatcher.match(listOf(1, 2, 3)))
    }

    @Test
    fun testReversed() {
        val valueMatcher = ValueMatcher.equal(5)
        val result = valueMatcher.reversed()
        assert(result.matcher == ValueMatcher.Matcher.NOT_EQUAL)
    }
}
