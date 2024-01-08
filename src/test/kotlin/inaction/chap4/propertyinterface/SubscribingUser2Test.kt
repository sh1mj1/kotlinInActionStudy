package inaction.chap4.propertyinterface

import org.junit.jupiter.api.Test

class SubscribingUser2Test {
    @Test
    fun testSubscribingUser() {
        val subscribingUser2 = SubscribingUser2("sh1mj1@kotlinlang.org")
        assert(subscribingUser2.nickname == "sh1mj1")
    }
}