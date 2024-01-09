package effective.item40.reflexive

import org.junit.jupiter.api.RepeatedTest
import kotlin.test.assertTrue

class FixedTimeTest {
    @RepeatedTest(100_000)
    fun `FixedTime 의 equals 를 100_000 번 테스트`() {
        val now1 = TimePoint(1300)
        assertTrue { now1 == now1 }

        val now2 = Now()
        assertTrue { now2 == now2 }
    }

}