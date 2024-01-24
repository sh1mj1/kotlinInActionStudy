package inaction.chap7.destructuringDeclarationAndComponent4

import inaction.chap7.OverloadingArithmeticOperator1.Point
import org.junit.jupiter.api.Test

class DestructuringDeclarationKtTest {
    @Test
    fun testDestructuringDeclaration() {
        val p = Point(10, 20)
        val (x, y) = p
        assert(x == 10 && y == 20)
    }

    @Test
    fun testSplitFileName() {
        val (name, ext) = splitFileName("example.kt")
        assert(name == "example" && ext == "kt")
    }

    @Test
    fun testPrintEntries() {
        val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
        printEntries(map)
        // print
        /*
        Oracle -> Java
        JetBrains -> Kotlin
         */
    }
}