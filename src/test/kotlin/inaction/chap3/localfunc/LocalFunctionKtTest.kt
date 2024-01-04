package inaction.chap3.localfunc

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LocalFunctionKtTest {

    @Test
    fun saveUserTest() {
        assertThrows<IllegalArgumentException> { saveUser(User(1, "", "")) }
    }

    @Test
    fun saveUser1Test() {
        assertThrows<IllegalArgumentException> { saveUser1(User(1, "", "")) }
    }

    @Test
    fun saveUser2Test() {
        assertThrows<IllegalArgumentException> { saveUser2(User(1, "", "")) }
    }

    @Test
    fun saveUser3Test() {
        assertThrows<IllegalArgumentException> { saveUser3(User(1, "", "")) }
    }

}