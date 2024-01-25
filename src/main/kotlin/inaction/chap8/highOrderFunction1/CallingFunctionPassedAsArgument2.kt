package inaction.chap8.highOrderFunction1

fun twoAndThree(operation: (Int, Int) -> Int): String { // 함수 타입인 파라미터를 선언
    val result = operation(2, 3) // 함수 타입인 파라미터를 호출
    return "The result is $result"
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}