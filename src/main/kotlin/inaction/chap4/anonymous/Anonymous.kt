package inaction.chap4.anonymous

import java.awt.Frame
import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun anonymous() {
    val window = Window(Frame("title"))
    window.addMouseListener(
        object : MouseAdapter() { // MouseAdapter 를 확장하는 익명 객체 선언
            override fun mouseClicked(e: MouseEvent?) { // 메서드 오버라이드
                super.mouseClicked(e)
            }
            // ...
        }
    )
    val listener = object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
        }
        // ...
    }
}

fun countClicks(window: Window) {
    var clickCount = 0
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            clickCount++
            super.mouseClicked(e)
        }
        // ...
    })
}