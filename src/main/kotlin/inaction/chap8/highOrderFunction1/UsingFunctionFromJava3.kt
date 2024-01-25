package inaction.chap8.highOrderFunction1

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}