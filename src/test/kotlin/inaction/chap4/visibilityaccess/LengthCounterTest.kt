package inaction.chap4.visibilityaccess

import org.junit.jupiter.api.Test

class LengthCounterTest {
    @Test
    fun testLengthCounter(){
        val lengthCounter = LengthCounter()
        lengthCounter.addWord("Hi!")
        assert(lengthCounter.counter == 3)
//        lengthCounter.counter = 3 // Cannot assign to 'counter': the setter is private in 'LengthCounter'
    }
}