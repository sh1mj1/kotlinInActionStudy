package inaction.chap9.variance3

import org.junit.jupiter.api.Test
import java.util.*


class StarProjection6KtTest {
    @Test
    fun testStarProjection1() {
        val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
        val chars = mutableListOf('a', 'b', 'c')
        val unknownElements: MutableList<*> = if (Random().nextBoolean()) list else chars
//        unknownElements.add(42) // [COMPILE ERROR] The integer literal does not conform to the expected type Nothing
//         1.3.72 이전 버전: Out-projected type 'MutableList<*>' prohibits the use of 'public abstract fun add(element: E): Boolean defined in kotlin.collections.MutableList'
        println(unknownElements.first()) /* a */
        println(unknownElements[1]) // sometimes 1, sometimes b
    }

    @Test
    fun testPrintFirst() {
        printFirst(listOf("Svetlana", "Dmitry"))
    }
}