package inaction.chap4.dataclass

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ClientTest {
    @Test
    fun testMutableProperty() {
        val client = Client("sh1mj1", 4122)
        val hashSet = hashSetOf(client)
        assertTrue { hashSet.contains(client) }
//        client.postalCode = 1000
        println(hashSet)
//        assertFalse { hashSet.contains(client) }
//        assertFalse { hashSet.contains(Client("sh1mj1", 1000)) }
//        assertFalse { hashSet.contains(Client("sh1mj1", 4122)) }
    }

    @Test
    fun testCopy() {
        val client = Client("sh1mj1", 4122)
        val hashSet = hashSetOf(client)
        val client2 = client.copy(postalCode = 1000)
        assertTrue { hashSet.contains(client) }
        assertTrue { hashSet.contains(Client("sh1mj1", 4122)) }
        assertFalse { hashSet.contains(client2) }
    }

    @Test
    fun testDestructuringDeclaration() {
        val client = Client("sh1mj1", 4122)
        val (name, postalCode) = client
        assertTrue { name == "sh1mj1" }
        assertTrue { postalCode == 4122 }
    }

    @Test
    fun testComponentN() {
        val client = Client("sh1mj1", 4122)
        assertTrue { client.component1() == "sh1mj1" }
        assertTrue { client.component2() == 4122 }
    }

}