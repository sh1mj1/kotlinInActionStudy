package inaction.chap6.nullability1.let7

import org.junit.jupiter.api.Test

class LetKtTest {
    @Test
    fun testSendEmailTo() {
        val email: String? = "someEmail@kotlin.org"
//        sendEmailTo(email) // [ERROR] Type mismatch: inferred type is String? but String was expected

        if (email != null) sendEmailTo(email)

        email?.let { email -> sendEmailTo(email) } // 혹은 아래처럼
//        email?.let { sendEmailTo(it) }

        val emailNull = null
        emailNull?.let { sendEmailTo(it) }
    }
}