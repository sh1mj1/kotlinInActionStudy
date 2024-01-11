package inaction.chap4.`object`.comptonormal

import org.junit.jupiter.api.Test

class Person2Test {
    @Test
    fun testPerson2() {
        val person2 = Person2.Loader.fromJSON("{name: 'sh1mj1'}")
        assert(person2.name == "sh1mj1")
    }

}