package inaction.chap4.`object`.compextension

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun testPerson() {
        val p = Person.fromJSON(
            """
                {
                "firstName" : "John",
                "lastName" : "Jackson"
            }
            """
        )
        assert(p.firstName == "John")
        assert(p.lastName == "Jackson")
    }

    @Test
    fun testSomeMethodOfPerson() {
        val p = Person("John", "Jackson")
        assert(p.someMethod("1") == "JohnJackson1")
    }
}

