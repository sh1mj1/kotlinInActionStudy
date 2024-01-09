package effective.item40.reflexive

import org.junit.jupiter.api.RepeatedTest
import kotlin.test.assertTrue

class TimeTest {
    @RepeatedTest(10000)
    fun `Time 의 equals 를 10000 번 테스트`() {
        val now = Time(isNow = true)
        assertTrue { now == now } // true 일 때도 false 일 때도 있음.
    }

}