package inaction.chap5.lambdaExpressionAndMemberReference1.lamda_format3

import inaction.chap5.lambdaExpressionAndMemberReference1.lamda_collection2.Person

val sum = {x: Int, y: Int -> x + y}

val people = listOf(Person("Alice", 29), Person("Bob", 31))

// 가장 기본적인 코틀린 람다 식의 문법

