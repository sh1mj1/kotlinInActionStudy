package inaction.chap7.collectionAndRangeConvention3

import org.junit.jupiter.api.Test

class MutablePointKtTest {
    @Test
    fun testSetMutablePoint() {
        val p = MutablePoint(10, 20)
        p[1] = 42
        assert(p == MutablePoint(10, 42))
    }
}