package inaction.chap6.nullability1.nullableExtension9

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
        return
    }
    println("input length: ${input.length}") // safe call 할 필요 없음
}

fun verifyUserInputNormal(input: String?) {
    if (nullOrBlank(input)) {
        println("Please fill in the required fields")
        return
    }
    println("input length: ${input.length}") // 컴파일 에러 발생 안함
}

@OptIn(ExperimentalContracts::class)
fun nullOrBlank(input: String?): Boolean {
    contract{
        returns(false) implies (input != null)
    }
    return input == null || input.isBlank()
}