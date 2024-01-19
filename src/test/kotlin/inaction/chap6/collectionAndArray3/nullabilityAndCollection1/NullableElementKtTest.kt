package inaction.chap6.collectionAndArray3.nullabilityAndCollection1

import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.StringReader

class NullableElementKtTest {

    @Test
    fun testReadAndAddNumbers() {
        val reader = BufferedReader(StringReader("1\nabc1\n42"))
        val numbers = readNumbers(reader)
        addValidNumbers(numbers)
    }
}