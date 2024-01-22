package inaction.chap6.collectionAndArray3.readOnlyAndMutableCollection2

import org.junit.jupiter.api.Test

class ReadOnlyAndMutableCollectionKtTest {

    @Test
    fun copyElements() {
        val source: Collection<Int> = arrayListOf(3, 5, 7)
        val target: MutableCollection<Int> = arrayListOf(1)
        copyElements(source, target)
        assert(target == arrayListOf(1, 3, 5, 7))
    }
}