package inaction.chap9.variance3

import org.junit.jupiter.api.Test

class UseSiteVariance5KtTest {
    @Test
    fun testCopyData1() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData1(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }

    @Test
    fun testCopyData2() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData2(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }

    @Test
    fun testCopyData3() {
        val ints = mutableListOf(1, 2, 3)
        val anyItems = mutableListOf<Any>()
        copyData3(ints, anyItems)
        println(anyItems)
        /* print
        [1, 2, 3]
         */
    }
}