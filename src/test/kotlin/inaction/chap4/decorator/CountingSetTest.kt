package inaction.chap4.decorator

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class CountingSetTest {
    @Test
    fun testCountingSet() {
        val cSet = CountingSet<Int>()
        cSet.addAll(listOf(1, 1, 2))
        assertTrue { cSet.objectsAdded == 3 && cSet.size == 2 }
    }


}