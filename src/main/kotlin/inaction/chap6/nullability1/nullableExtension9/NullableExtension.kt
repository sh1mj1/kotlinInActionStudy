package inaction.chap6.nullability1.nullableExtension9

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
//    println("input length: ${input.length}") // 컴파일 에러 발생
}

fun nullOrBlank(input: String?): Boolean {
    return input == null || input.isBlank()
}