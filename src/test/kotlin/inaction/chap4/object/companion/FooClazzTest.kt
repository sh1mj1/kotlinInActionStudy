package inaction.chap4.`object`.companion

import org.junit.jupiter.api.Test

class FooClazzTest {
    @Test
    fun testFooClazz() = assert(FooClazz.foo() == "Companion object called")
}