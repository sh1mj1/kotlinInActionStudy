package inaction.chap7.collectionAndRangeConvention3

import inaction.chap7.OverloadingArithmeticOperator1.Point
import org.junit.jupiter.api.Test

class PointUtilKtTest {
    @Test
    fun testGetPoint() {
        val p = Point(10, 20)
        assert(p[1] == 20)
    }
}