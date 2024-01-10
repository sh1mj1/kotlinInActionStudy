package inaction.chap4.`object`.normal

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun testPerson() {
        val persons = listOf(Person("Bob"), Person("Alice"))
        assert(
            persons.sortedWith(Person.NameComparator) == listOf(Person("Alice"), Person("Bob"))
        )
    }
}