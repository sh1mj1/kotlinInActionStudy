package inaction.chap4

import org.junit.jupiter.api.Test

class ButtonTest {
    @Test
    fun clickTest() = Button().click()

    @Test
    fun mainTest() {
        val button = Button()
        button.showOff()
        button.setFocus(true)
        button.click()
    }
}