package inaction.chap7.collectionAndRangeConvention3

import inaction.chap7.OverloadingArithmeticOperator1.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RectangleKtTest {
    @Test
    fun testRectangleContainsPoint() {
        val rect = Rectangle(Point(10, 20), Point(50, 50))
        assertTrue { Point(20, 30) in rect }
        assertFalse { Point(5, 5) in rect }
    }
}