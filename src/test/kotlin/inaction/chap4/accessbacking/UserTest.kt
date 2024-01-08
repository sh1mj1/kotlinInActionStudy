package inaction.chap4.accessbacking

import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun testUser() {
        val user = User("sh1mj1")
        user.address = "동대문구 서울"
    }

}