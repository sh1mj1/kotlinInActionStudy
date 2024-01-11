package inaction.chap5.lamda_format1_3

import inaction.chap5.lamda_collection1_2.Person

val sum = {x: Int, y: Int -> x + y}

val people = listOf(Person("Alice", 29), Person("Bob", 31))

// 가장 기본적인 코틀린 람다 식의 문법

