package effective.item44

import org.junit.jupiter.api.Test

class PhoneBookIncorrectTest {

    @Test
    fun `멤버 확장 함수를 사용한다`() {
        PhoneBookIncorrect().apply {
            println("1234567890".isPhoneNumber())
        }
    }


}