package inaction.chap6.collectionAndArray3.kotlinCollectionAndJava3

import org.junit.jupiter.api.Test

class KotlinCollectionAndJavaKtTest {
    @Test
    fun testArrayList() {
        val list = JavaCollectionAndKotlin().list
        assert(list is MutableList<Int>)
        assert(list is List<Int>)
        assert(list is MutableCollection<Int>)
        assert(list is Collection<Int>)
        assert(list is MutableIterable<Int>)
        assert(list is Iterable<Int>)
    }

    @Test
    fun testHashSet() {
        val set = JavaCollectionAndKotlin().set
        assert(set is MutableSet<Int>)
        assert(set is MutableCollection<Int>)
        assert(set is Collection<Int>)
        assert(set is MutableIterable<Int>)
        assert(set is Iterable<Int>)

        assert(setOf(1, 2) is java.util.LinkedHashSet)
    }

    @Test
    fun testPrintInUppercase() {
        val list = listOf("a", "b", "c")
        assert(printInUppercase(list) == "A")
    }
}