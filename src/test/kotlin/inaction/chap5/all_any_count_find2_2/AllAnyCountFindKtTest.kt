package inaction.chap5.all_any_count_find2_2

import inaction.chap5.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AllAnyCountFindKtTest {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31))


    @Test
    fun allTest() {
        assertFalse { people.all(canBeInClub27) }
    }

    @Test
    fun anyTest() {
        assertTrue { people.any(canBeInClub27) }
    }

    @Test
    fun countTest() {
        val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("John", 20), Person("Harry", 25))
        assert(people.count { it.age <= 27 } == 3)
        assert(people.filter { it.age <= 27 }.size == 3)
    }

    @Test
    fun findTest() {
        val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("John", 20), Person("Harry", 25))
        assert(people.find { it.age <= 27 } == Person("Alice", 27))
        assert(people.firstOrNull { it.age <= 27 } == Person("Alice", 27))
    }

}