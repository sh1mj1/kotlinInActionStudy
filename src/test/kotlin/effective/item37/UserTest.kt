package effective.item37

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class UserTest {
    @Test
    fun testUser() {
        val user = User("sh1mj1")
        val (name) = user
        assertTrue { name == "sh1mj1" }

        user.let { a -> println(a) } // User(name=sh1mj1)
        user.let { (a) -> println(a) } // sh1mj1
    }
}