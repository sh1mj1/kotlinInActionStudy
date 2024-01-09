package inaction.chap4.mustdefine

import inaction.chap1.Person
import org.junit.jupiter.api.Test

class ClientTest {
    @Test
    fun testToString() {
        val client = Client("sh1mj1", 4122)
        assert(client.toString() == "Client(name='sh1mj1', postalCode=4122)")
    }

    @Test
    fun testEquals() {
        val client1 = Client("sh1mj1", 4122)
        val client2 = Client("sh1mj1", 4122)
        assert(client1 == client2)
    }


}