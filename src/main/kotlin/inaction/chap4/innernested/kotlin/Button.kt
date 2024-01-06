package inaction.chap4.innernested.kotlin

import inaction.chap4.innernested.State
import inaction.chap4.innernested.View

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    inner class ButtonState : State {
        // 여기에 Button 에 대한 구체적인 정보를 추가
    }
}


class Outer() {
    val field1: Int = 0
    inner class Inner() {
        val field1: Int = 1
        fun getOuterReference(): Outer = this@Outer
        fun getOuterField1(): Int = this@Outer.field1
    }
}