package inaction.chap3.strings

fun splitString1(string: String) = println(string.split("[.\\-]".toRegex()))

fun splitString2(string: String) = println(string.split(".", "-"))