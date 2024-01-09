package effective.item40

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class AnimalTest {
    @Test
    fun `equals 사용과 == 사용`() {
        assertFalse { Animal().equals(Book()) } // 가능
        assertFalse { Animal() == Cat() } // 가능
//        assertFalse { Animal() == (Book()) } // ERROR Operator '==' cannot be applied to 'Animal' and 'Book'
    }
}