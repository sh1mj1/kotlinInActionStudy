package inaction.chap9.genericTypeParameter1

import org.junit.jupiter.api.Test

class TypeParameterConstraint3KtTest {
    @Test
    fun testSum() {
        assert(listOf(1, 2, 3).sum() == 6)
    }

    @Test
    fun testOneHalf() {
        assert(oneHalf(3) == 1.5)
    }

    @Test
    fun testMax() {
        assert(max("kotlin", "java") == "kotlin")
    }

    @Test
    fun testEnsureTrailingPeriod() {
        val helloWorld = StringBuilder("Hello World")
        ensureTailingPeriod(helloWorld)
        assert(helloWorld.toString() == "Hello World.")
    }
}