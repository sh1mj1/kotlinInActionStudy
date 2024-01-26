package inaction.chap8.inlineFunction2

import org.junit.jupiter.api.Test

class InliningCollectionOperation3KtTest {
    @Test
    fun testPerson() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(people.filter { it.age < 30 } == listOf(Person("Alice", 29)))

        val result = mutableListOf<Person>()
        for (person in people) {
            if (person.age < 30) result.add(person)
        }
        assert(result == listOf(Person("Alice", 29)))

        assert(people.filter { it.age > 30 }.map(Person::name) == listOf("Bob"))
    }
}