package inaction.chap7.OverloadingComparisionOperator2

import org.junit.jupiter.api.Test

class PointTest {
    @Test
    fun testPointEquals() {
        assert(Point(10, 20) == Point(10, 20))
        assert(Point(10, 20) != Point(5, 5))
        assert(null == Point(1, 2))
    }
}