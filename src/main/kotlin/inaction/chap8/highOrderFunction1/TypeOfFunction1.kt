package inaction.chap8.highOrderFunction1

val sum: (Int, Int) -> Int = { x, y -> x + y }
val action = { println(42) }

//val canReturnNull: (Int, Int) -> Int? = { x, y -> null }
val canReturnNull: (Int, Int) -> Int? = { _, _ -> null }

val funOrNull: ((Int, Int) -> Int)? = null

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit) {
    println("url: $url") // 여기에 실제 HTTP 요청 등의 로직 구현한다고 가정

    val responseCode = 200 // 가상의 응답 생성
    val responseBody = "this is the response content"

    callback(responseCode, responseBody)
}
