package effective.item40.transitive

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DateTest {
    @Test
    fun testDateAndDateTime() {
        val o1 = DateTime(Date(1992, 10, 20), 12, 30, 0)
        val o2 = Date(1992, 10, 20)
        val o3 = DateTime(Date(1992, 10, 20), 14, 45, 30)

        assertTrue { o1 == o2 }
        assertTrue { o2 == o3 }
        assertFalse { o1 == o3 }
    }
}