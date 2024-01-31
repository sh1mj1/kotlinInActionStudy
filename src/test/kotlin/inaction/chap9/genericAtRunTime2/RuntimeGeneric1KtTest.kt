package inaction.chap9.genericAtRunTime2

import org.junit.jupiter.api.Test

class RuntimeGeneric1KtTest {

    @Test
    fun testPrintSum() {
        printSum(listOf(1, 2, 3))
    }

    @Test
    fun testPrintSum2() {
        printSum2(listOf(1, 2, 3))
    }
}