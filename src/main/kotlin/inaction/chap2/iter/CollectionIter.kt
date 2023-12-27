package inaction.chap2.iter

import java.util.*


fun mapIter() {
    val binaryReps = TreeMap<Char, String>() // 키에 대해 정렬하기 위해 TreeMap 사용

    for (c in 'A'..'F') { // A 부터 F 까지 문자의 범위를 사용해 iteration
        val binary = Integer.toBinaryString(c.code) // ASCII 코드를 2진 표현으로 바꿈
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) { // map 에 대해 iteration
        println("$letter: $binary")
    }
}

fun listIter() {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}
