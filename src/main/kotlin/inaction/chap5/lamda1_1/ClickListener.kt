package inaction.chap5.lamda1_1

import java.awt.Button

fun setListener(button: Button) = button.addActionListener { println("수행할 동작을 구현하자") }

