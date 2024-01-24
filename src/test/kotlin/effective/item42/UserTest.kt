package effective.item42

import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun testSortedByUser() {
        val names = listOf(User("Alice", "Smith"), User("Bob", "Johnson"))
        val sorted = names.sortedBy { it.surname }
        assert(sorted == listOf(User("Bob", "Johnson"), User("Alice", "Smith")))
    }

    @Test
    fun testSortedWithUser() {
        val names = listOf(User("Alice", "Smith"), User("Bob", "Smith"))
        val sorted = names.sortedWith(compareBy({ it.surname }, { it.name }))
        assert(sorted == listOf(User("Alice", "Smith"), User("Bob", "Smith")))
    }

    @Test
    fun testSortUsingCompanionObj() {
        val names = listOf(User("Alice", "Smith"), User("Bob", "Smith"))
        val sorted = names.sortedWith(User.DISPLAY_ORDER)
        assert(sorted == listOf(User("Alice", "Smith"), User("Bob", "Smith")))
    }
}