package inaction.chap7.collectionAndRangeConvention3

import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertTrue

class RangeToKtTest {
    @Test
    fun testRangeToLocalDate() {
        val now = LocalDate.now()
        val vacation = now..now.plusDays(10)
        assertTrue { now.plusWeeks(1) in vacation }
    }
}