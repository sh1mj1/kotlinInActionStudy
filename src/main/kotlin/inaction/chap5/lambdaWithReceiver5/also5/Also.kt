package inaction.chap5.lambdaWithReceiver5.also5

val numbers = mutableListOf("one", "two", "three")
fun alsoFunc(): List<String> {
    numbers
        .also { println("The list elements before adding new one: $it") }
        .add("four")
        .also { println("add Success? : $it") }
    return numbers
}
