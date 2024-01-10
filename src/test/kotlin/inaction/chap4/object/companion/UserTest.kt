package inaction.chap4.`object`.companion

import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun testUser() {
        val subscribingUser = User.newSubscribingUser("bob@gmail.com")
        val facebookUser = User.newFacebookUser(4)
        assert(
            subscribingUser.nickname == "bob" && facebookUser.nickname == "sh1mj1"
        )
    }

    @Test
    fun testUser2() {
        val subscribingUser = User2(email = "bob@gmail.com")
        val facebookUser = User2(facebookAccountId = 4)
        assert(
            subscribingUser.nickname == "bob" && facebookUser.nickname == "sh1mj1"
        )
    }
}