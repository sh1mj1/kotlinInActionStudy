package inaction.chap8.highOrderFunction1

import org.junit.jupiter.api.Test

class CallingFunctionPassedAsArgument2KtTest {
    @Test
    fun testTwoAndThree() {
        assert(twoAndThree { a, b -> a + b } == "The result is 5")
        assert(twoAndThree { a, b -> a * b } == "The result is 6")
    }

    @Test
    fun testCustomStringFilter() {
        assert("ab1c".filter { it in 'a'..'z' } == "abc")
    }
}