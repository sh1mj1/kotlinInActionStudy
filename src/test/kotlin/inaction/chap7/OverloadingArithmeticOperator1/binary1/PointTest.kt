package inaction.chap7.OverloadingArithmeticOperator1.binary1

import inaction.chap7.OverloadingArithmeticOperator1.Point
import inaction.chap7.OverloadingArithmeticOperator1.plus
import inaction.chap7.OverloadingArithmeticOperator1.times
import org.junit.jupiter.api.Test

class PointTest {
    @Test
    fun testPointPlus() {
        val p1 = Point(10, 20)
        val p2 = Point(30, 40)
        assert(p1 + p2 == Point(40, 60))
    }

    @Test
    fun testPointTimes() {
        val p = Point(10, 20)
        assert(p * 1.5 == Point(15, 30))
    }

    @Test
    fun testTimesToString() {
        assert('a' * 3 == "aaa")
    }
}