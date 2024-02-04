package inaction.chap9.variance3


fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}