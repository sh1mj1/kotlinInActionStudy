package inaction.chap9.genericAtRunTime2

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DeclaringFunctionsWithReifiedTypeParameter2KtTest {
    @Test
    fun testIsA() {
        assertTrue(isA<String>("abc"))
        assertFalse(isA<String>(123))
    }

    @Test
    fun testFilterIsInstance() {
        val items = listOf("one", 2, "three")
        assert(items.filterIsInstance<String>() == listOf("one", "three"))
    }
}