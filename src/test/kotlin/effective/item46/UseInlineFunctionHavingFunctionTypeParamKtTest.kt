package effective.item46

import org.junit.jupiter.api.Test
import kotlin.time.measureTimedValue

class UseInlineFunctionHavingFunctionTypeParamKtTest {
    val blackhole = Blackhole()

    @Test
    fun nothingInline() = println(measureTimedValue { repeat(100_000_000) { blackhole.consume(it) } })

    @Test
    fun nothingNonInline() = println(measureTimedValue { repeatNoinline(100_000_000) { blackhole.consume(it) } })

    @Test // 38.2 ms // 람다에서 지역 변수 캡처
    fun nothingInlineLambdaCapture() = println(measureTimedValue {
        var l = 0L
        repeat(100_000_000) { l += it }
        blackhole.consume(l.toInt())
    })

    @Test // 73.1 ms // 람다에서 지역 변수 캡처
    fun nothingNonInlineLambdaCapture() = println(measureTimedValue {
        var l = 0L
        repeatNoinline(100_000_000) { l += it }
        blackhole.consume(l.toInt())
    })
}

class Blackhole {
    fun consume(count: Int) = count
}


