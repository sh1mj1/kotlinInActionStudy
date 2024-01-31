package effective.item23

import org.junit.jupiter.api.Test

class ForestTest {
    @Test
    fun testForest() {
        val forest = Forest<Birch>()
        forest.addTree(Birch())
//        forest.addTree(Spruce()) // [COMPILE ERROR] Type mismatch: inferred type is Spruce but Birch was expected
    }
}