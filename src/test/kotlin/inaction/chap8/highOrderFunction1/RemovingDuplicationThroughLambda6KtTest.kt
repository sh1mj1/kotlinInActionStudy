package inaction.chap8.highOrderFunction1

import org.junit.jupiter.api.Test

class RemovingDuplicationThroughLambda6KtTest {
    @Test
    fun testAverageWindowsDuration() {
        val averageWindowsDuration = log.filter { it.os == OS.WINDOWS }
            .map(SiteVisit::duration)
            .average()
        assert(averageWindowsDuration == 23.0)
    }

    @Test
    fun testAverageOSDuration() {
        assert(log.averageDurationFor1(OS.WINDOWS) == 23.0)
        assert(log.averageDurationFor1(OS.MAC) == 22.0)
    }

    @Test
    fun testAverageMobileDuration() {
        val averageMobileDuration = log.filter { it.os in setOf(OS.IOS, OS.ANDROID) }
            .map(SiteVisit::duration)
            .average()
        assert(averageMobileDuration == 12.15)
    }

    @Test
    fun testAverageOSDuration2() {
        assert(log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) } == 12.15)
        assert(log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" } == 8.0)
    }
}