package inaction.chap9.genericAtRunTime2

inline fun <reified T> isA(value: Any?) = value is T