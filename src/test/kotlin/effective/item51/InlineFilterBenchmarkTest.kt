package effective.item51

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.time.measureTimedValue


class InlineFilterBenchmarkTest {

    private lateinit var list: List<Int>
    private lateinit var array: IntArray

    @BeforeEach
    fun setUp() {
        list = List(10_000_000) { it }
        array = IntArray(10_000_000) { it }
    }

    @Test
    fun averageOnIntList() = println(measureTimedValue { list.average() })

    @Test
    fun averageOnIntArray() = println(measureTimedValue { array.average() })

}