package inaction.chap4.constructor.secondcons

import org.junit.jupiter.api.Test
import javax.naming.InitialContext
import javax.print.attribute.HashAttributeSet

class ButtonTest {
    @Test
    fun myButtonTest() {
        val myButton1 = MyButton(context = InitialContext())
        val myButton2 = MyButton(context = InitialContext(), attrs = HashAttributeSet())

        assert(myButton1 is MyButton)
        assert(myButton2 is MyButton)
    }

    @Test
    fun thisButtonTest() {
        val thisButton1 = ThisButton(context = InitialContext())
        assert(thisButton1 is ThisButton)
    }
}