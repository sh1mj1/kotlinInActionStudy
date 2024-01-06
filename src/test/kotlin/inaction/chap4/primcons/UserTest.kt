package inaction.chap4.primcons

import inaction.chap4.constructor.primcons.User
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class UserTest {
    @Test
    fun userTest() {
        val sh1mj1 = User("심지")
        assert(sh1mj1.nickname == "심지")
        assertTrue(sh1mj1.isSubscribed)

        val sh1mj12 = User("심지2", false)
        assertFalse(sh1mj12.isSubscribed)

        val sh1mj13 = User("심지3", isSubscribed = false)
        assertFalse(sh1mj13.isSubscribed)
    }
}

