package inaction.chap5.lambdaWithReceiver5.run3

class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun runFunc(): String {
    val service = MultiportService("https://example.kotlinlang.org", 80)
    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    return result
}

fun runSafeCall(){
    val str1: String? = "Hello"
    var str2: String? = null
    val len1 = str1?.run {
        println("let() called at $this")
        length // this 생략
    }
    println("str1 의 길이 : $len1")

    val len2 = str2?.run {
        println("let() called at $this")
        length // this 생략
    }
    println("str2 의 길이 : $len2")
}