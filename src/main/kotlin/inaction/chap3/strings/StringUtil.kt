package inaction.chap3.strings

fun String.lastChar(): Char = this[this.length - 1]

val String.lastChar: Char
    get() = this[this.length - 1]

var StringBuilder.lastChar: Char
    get() = this[this.length - 1]
    set(value) = this.setCharAt(length - 1, value)