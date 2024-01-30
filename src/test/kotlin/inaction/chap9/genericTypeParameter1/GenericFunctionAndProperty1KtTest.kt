package inaction.chap9.genericTypeParameter1

import org.junit.jupiter.api.Test

class GenericFunctionAndProperty1KtTest {
    @Test
    fun testSlice() {
        val letters = ('a'..'z').toList()
        assert(letters.slice<Char>(0..2) == listOf('a', 'b', 'c'))
        assert(letters.slice(10..13) == listOf('k', 'l', 'm', 'n'))
    }

    @Test
    fun testFilter() {
        val authors = listOf("Dmitry", "Svetlana")
        val readers = mutableListOf("Dmitry", "Bob", "Alice")
        assert(readers.filter { it !in authors } == listOf("Bob", "Alice"))
    }

    @Test
    fun testPenultimate() {
        assert(listOf(1,2,3,4).penultimate == 3)
    }
}