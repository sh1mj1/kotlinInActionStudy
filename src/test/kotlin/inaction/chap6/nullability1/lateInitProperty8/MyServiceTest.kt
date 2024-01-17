package inaction.chap6.nullability1.lateInitProperty8

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MyServiceTest {
    private lateinit var myService: MyService // 지연 초기화 프로퍼티 선언

    @BeforeEach
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() = assert("foo" == myService.performAction()) // null-check 없이 프로퍼티 사용 가능
}