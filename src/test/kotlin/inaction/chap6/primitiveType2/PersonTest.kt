package inaction.chap6.primitiveType2

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun isOlderThan() {
        assertFalse(Person("Sam", 35).isOlderThan(Person("Amy", 42))!!)
        assertNull(Person("Sam", 35).isOlderThan(Person("Jane")))
    }

    @Test
    fun testNumberCasting() {
        val x = 1 // Int 타입
        val list = listOf(1L, 2L, 3L) // List<Long>
//        x in list // [COMPILE ERROR]
    }

    @Test
    fun testNumberCasting2() {
        val x = 1 // Int 타입
        val list = listOf(1L, 2L, 3L) // List<Long>
        assert(x.toLong() in list) // [COMPILE ERROR]
    }

    @Test
    fun testFoo() {
        val b: Byte = 1 // 상수 값은 적절한 타입으로 해석됨.
        foo(42) // 컴파일러는 42 를 Long 값으로 해석
        val l = b + 1L // + 는 Byte 와 Long 을 인자로 받기 가능

        foo(l)
    }
}