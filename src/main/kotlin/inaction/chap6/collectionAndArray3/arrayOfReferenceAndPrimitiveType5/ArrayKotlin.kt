package inaction.chap6.collectionAndArray3.arrayOfReferenceAndPrimitiveType5

fun main(args: Array<String>) {
//    for (i in args.indices) {
//        println("Argument $i is: ${args[i]}")
//    }
    args.forEachIndexed { index, s ->
        println("Argument $index is: $s")
    }
}

fun makeAlphabet() {
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}

fun passCollectionToVararg() {
    val strings = listOf("a", "b", "c")
    println("%s/ %s/ %s".format(*strings.toTypedArray()))
}