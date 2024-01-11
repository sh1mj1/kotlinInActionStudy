package inaction.chap5.member_reference1_5


val getAge = Person::age

fun salute() = println("Salute")

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 21


