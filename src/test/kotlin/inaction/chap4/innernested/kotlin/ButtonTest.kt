package inaction.chap4.innernested.kotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import java.io.ByteArrayOutputStream
import java.io.NotSerializableException
import java.io.ObjectOutputStream

class ButtonTest {

    @Test // 코틀린 ButtonState 가 일반 class 이면 성공
    fun kotlinButtonStateSerializeTest() {
        val button = Button()
        val state: Button.ButtonState = button.getCurrentState() as Button.ButtonState
        assertDoesNotThrow {
            val baos = ByteArrayOutputStream();
            val oos = ObjectOutputStream(baos)
            oos.writeObject(state)
            oos.close()
        }
    }

    @Test // 코틀린 ButtonState 가 inner class 이면 성공
    fun kotlinButtonStateSerializeTest2() {
        val button = Button()
        val state: Button.ButtonState = button.getCurrentState() as Button.ButtonState
        assertThrows<NotSerializableException> {
            val baos = ByteArrayOutputStream();
            val oos = ObjectOutputStream(baos)
            oos.writeObject(state)
            oos.close()
        }
    }
}