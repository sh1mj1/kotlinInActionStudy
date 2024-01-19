package inaction.chap6.collectionAndArray3.nullabilityAndCollection1

import java.io.BufferedReader

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>() // Int? 값으로 이뤄진 리스트 생성
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null) // 현재 줄을 파싱할 수 없으므로 리스트에 null 을 추가
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull() // 타입이 List<Int> 가 됨.
    println("Sum of valid numbers: ${validNumbers.sum()} ")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

//fun addValidNumbers(numbers: List<Int?>) {
//    var sumOfValidNumbers = 0
//    var invalidNumbers = 0
//    for (number in numbers) {
//        if (number != null) {
//            sumOfValidNumbers += number
//        } else {
//            invalidNumbers++
//        }
//    }
//    println("Sum of valid numbers: $sumOfValidNumbers")
//    println("Invalid numbers: $invalidNumbers")
//}