package effective.item24

import org.junit.jupiter.api.Test

class FunctionTypeKtTest {

    private val intToDouble: (Int) -> Number = { it.toDouble() }
    private val numberAsText: (Number) -> Any = { it.toShort() }
    private val identity: (Number) -> Number = { it }
    private val numberToInt: (Number) -> Int = { it.toInt() }
    private val numberHash: (Any) -> Number = { it.hashCode() }

    @Test
    fun testProcessedNumber() {
        printProcessedNumber(intToDouble)
        printProcessedNumber(numberAsText)
        printProcessedNumber(identity)
        printProcessedNumber(numberToInt)
        printProcessedNumber(numberHash)
    }
}