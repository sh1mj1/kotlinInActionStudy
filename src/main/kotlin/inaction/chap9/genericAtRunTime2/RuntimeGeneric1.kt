package inaction.chap9.genericAtRunTime2

fun cannotCheckError() {
    val list = listOf<Int>()
//        if (list is List<String>) { /* ... */ }// Error: Cannot check for instance of erased type

}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> // [WARNING] Unchecked cast: Collection<*> to List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun printSum2(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}