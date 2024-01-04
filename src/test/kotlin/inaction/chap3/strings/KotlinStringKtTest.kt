package inaction.chap3.strings

import org.junit.jupiter.api.Test

class KotlinStringKtTest {

    @Test
    fun splitString1Test() = splitString1("12.345-6.A")

    @Test
    fun splitString2Test() = splitString2("12.345-6.A")

    @Test
    fun parsePath1Test() = parsePath1("/Users/sh1mj1/kotlin-book/chapter.adoc")

    @Test
    fun parsePath2Test() = parsePath2("/Users/sh1mj1/kotlin-book/chapter.adoc")

    @Test
    fun multilineStringTest() = multilineString()
}