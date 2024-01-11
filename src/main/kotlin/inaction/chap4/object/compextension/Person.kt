package inaction.chap4.`object`.compextension

// 비즈니스 로직 모듈에 위치
data class Person(val firstName: String, val lastName: String) {
    companion object {}
}

// 클라이언트/서버 통신 모듈에 위치
fun Person.Companion.fromJSON(json: String): Person {
    val keyValuePairs = json.trim().removeSurrounding("{", "}").trim()
        .split(",")
        .map { it.trim() }.associate {
            val (key, value) = it.split(":").map { part -> part.trim().removeSurrounding("\"") }
            key to value
        }
    return Person(
        firstName = keyValuePairs["firstName"] ?: "",
        lastName = keyValuePairs["lastName"] ?: ""
    )
}

// 동반 객체에 대한 확장 함수가 아닌, 그냥 확장 함수
fun Person.someMethod(str: String): String {
    println(str)
    return (this.firstName + this.lastName + str)
}