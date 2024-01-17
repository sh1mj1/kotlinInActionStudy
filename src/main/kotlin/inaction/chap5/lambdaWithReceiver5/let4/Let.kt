package inaction.chap5.lambdaWithReceiver5.let4


val numbers = mutableListOf("one", "two", "three", "four", "five")

/*
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        val resultList = numbers.map { it.length }.filter { it > 3 }
        println(resultList)
*/

fun letFunc(): String =
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
        it.toString()
    }

fun letFunc2() = numbers.map { it.length }.filter { it > 3 }.let(::println)

fun letNullCheck() {
    val str: String? = "Hello"
//    processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }
}

fun processNonNullString(string: String) {
    println("string $string 은 not-null")
}
