package inaction.chap2.exception

import java.io.BufferedReader

fun defaultException(percentage: Int) {
    if (percentage !in 1..100) {
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: $percentage"
        )
    }
}

fun expressionException(number: Int) {
    val percentage = if (number in 0..100) {
        number
    } else throw IllegalArgumentException(
        "A percentage value must be between 0 and 100: $number"
    )
}

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}