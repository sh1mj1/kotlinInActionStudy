package inaction.chap5.lambdaWithReceiver5.also5

import org.junit.jupiter.api.Test

class AlsoKtTest {
    @Test
    fun testAlsoFunc() {
        assert(alsoFunc() == listOf("one", "two", "three", "four"))
    }
}