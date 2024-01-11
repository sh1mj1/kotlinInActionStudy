package inaction.chap4.`object`.comptonormal

import org.junit.jupiter.api.Test

class PersonKtTest {
    @Test
    fun testPerson() {
        val person = loadFromJSON(Person) // loadFromJSON(Person.Companion)
        assert(person.name == "Dmitry")
    }
}
