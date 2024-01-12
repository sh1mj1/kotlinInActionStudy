package inaction.chap5.flatMap_flatten2_4

import org.junit.jupiter.api.Test

class FlatMapKtTest {

    @Test
    fun flatMapTest() {
        val strings = listOf("abc", "def")
        val result1 = strings.map { it.toList() }
        println(result1)  // print /* [[a, b, c], [d, e, f]] */
        assert(
            result1 == listOf(
                listOf('a', 'b', 'c'), listOf('d', 'e', 'f')
            )
        )

        val result2 = strings.flatMap { it.toList() }
        println(result2) // print /* [// print /* [[a, b, c], [d, e, f]]  */
        assert(
            result2 == listOf('a', 'b', 'c', 'd', 'e', 'f')
        )
    }

    @Test
    fun bookFlatMapTest() {
        val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")),
        )
        val result1 = books.map { it.authors }
        println(result1) /* [[Jasper Fforde], [Terry Pratchett], [Terry Pratchett, Neil Gaiman]] */
        assert(
            result1 == listOf(
                listOf("Jasper Fforde"), listOf("Terry Pratchett"), listOf("Terry Pratchett", "Neil Gaiman")
            )
        )

        val result2 = books.flatMap { it.authors }
        println(result2) /* [Jasper Fforde, Terry Pratchett, Terry Pratchett, Neil Gaiman] */
        assert(
            result2 == listOf(
                "Jasper Fforde", "Terry Pratchett", "Terry Pratchett", "Neil Gaiman"
            )
        )

        val result3 = result2.toSet()
        println(result3) /* [Jasper Fforde, Terry Pratchett, Neil Gaiman] */
        assert(
            result3 == setOf(
                "Jasper Fforde", "Terry Pratchett", "Neil Gaiman"
            )
        )
    }

    @Test
    fun testFlatten() {
        val listOfStringList = listOf(listOf(1, 2, 3, 4), listOf(11, 12, 13, 14))
        println(listOfStringList.flatten()) // print /* [1, 2, 3, 4, 11, 12, 13, 14] */
        assert(listOfStringList.flatten() == listOf(1, 2, 3, 4, 11, 12, 13, 14))
    }
}