package effective.item40.transitive

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FixedDateTest {
    @Test
    fun testFixedDate() {
        val o1 = FixedDateTime(FixedDate(1992, 10, 20), 12, 30, 0)
        val o2 = FixedDate(1992, 10, 20)
        val o3 = FixedDateTime(FixedDate(1992, 10, 20), 14, 45, 30)

        assertTrue { o1.date == o2 }
        assertTrue { o2 == o3.date }
        assertFalse { o1 == o3 }
        assertTrue { o1.date == o3.date }
    }
}