package inaction.chap7.collectionAndRangeConvention3

import org.junit.jupiter.api.Test
import java.time.LocalDate

class ClosedRangeUtilKtTest {
    @Test
    fun testLocalDateFor() {
        val newYear = LocalDate.ofYearDay(2017, 1)
        val daysOff = newYear.minusDays(1)..newYear
        for (dayOff in daysOff) {
            println(dayOff)
        }
    }
}