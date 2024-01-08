package inaction.chap4.propertyinterface

import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun testPrivateUser() {
        val privateUser = PrivateUser("sh1mj1")
        assert(privateUser.nickname == "sh1mj1")
    }

    @Test
    fun testSubscribingUser() {
        val subscriber = SubscribingUser("sh1mj1@kotlinlang.org")
        assert(subscriber.nickname == "sh1mj1")
    }

    @Test
    fun testFacebookUser() {
        val facebookUser = FacebookUser(9938)
        assert(facebookUser.nickname == "sh1mj1")
    }
}