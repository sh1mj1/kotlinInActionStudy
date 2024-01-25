package inaction.chap7.delegatedProperty5.savePropertyInMap5

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun testPersonMap() {
        val p = Person()
        val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
        for ((attrName, value) in data) {
            p.setAttribute(attrName, value)
        }
        assert(p.name == "Dmitry")
    }
}