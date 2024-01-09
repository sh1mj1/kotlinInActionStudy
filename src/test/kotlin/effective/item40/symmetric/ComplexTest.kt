package effective.item40.symmetric

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ComplexTest {
    @Test
    fun testComplex() {
        val complex = Complex(1.0, 0.0)
        assertTrue(complex.equals(1.0))
        assertTrue((1.0).equals(complex)) // FAIL
    }


}