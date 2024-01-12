package inaction.chap5.functionalApiForCollection2.filter_map1

import inaction.chap5.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class FilterAndMapKtTest {

    @Test
    fun filterTest() {
        val list = listOf(1, 2, 3, 4)
        val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")

        assert(
            list.filter { it % 2 == 0 } == listOf(2, 4)
        )
        assert(numbers.filterKeys { it % 2 == 0 } == mapOf(0 to "zero", 2 to "two"))
        assert(numbers.filterValues { it.contains('t') } == mapOf(2 to "two", 3 to "three"))

    }

    @Test
    fun filterPeopleTest() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(
            people.filter { it.age > 30 } == listOf(Person("Bob", 31))
        )
    }

    @Test
    fun mapTest() {
        val list = listOf(1, 2, 3, 4)
        val numbers = mapOf(0 to "zero", 1 to "one", 2 to "two", 3 to "three")

        assert(list.map { it * it } == listOf(1, 4, 9, 16))
        assert(list.mapIndexed { idx, value -> idx * value } == listOf(0, 2, 6, 12))

        assert(
            numbers.mapKeys { it.key.plus(1) } == mapOf(1 to "zero", 2 to "one", 3 to "two", 4 to "three") &&
                    numbers.mapKeys { it.value.uppercase() } == mapOf(
                "ZERO" to "zero",
                "ONE" to "one",
                "TWO" to "two",
                "THREE" to "three"
            )
        )

        assert(
            numbers.mapValues { it.value.uppercase() } == mapOf(0 to "ZERO", 1 to "ONE", 2 to "TWO", 3 to "THREE") &&
                    numbers.mapValues { it.key.plus(1) } == mapOf(0 to 1, 1 to 2, 2 to 3, 3 to 4)
        )

    }

    @Test
    fun mapPeopleNameTest() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(
            people.map { it.name } == listOf("Alice", "Bob")
        )
        assert(
            people.map(Person::age) == listOf("Alice", "Bob")
        )
    }

    @Test
    fun getMaxAgePeople1() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(
            people.filter { it.age == people.maxBy(Person::age).age } == listOf(Person("Bob", 31))
        )
    }

    @Test
    fun getMaxAgePeople2() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assertTrue {
            val maxAge = people.maxBy(Person::age).age
            people.filter { it.age == maxAge } == listOf(Person("Bob", 31))
        }
    }
}