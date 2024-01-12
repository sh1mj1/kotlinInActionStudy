package inaction.chap5.lazyCollectionOperationSequence3.sequenceEvaluation1

fun justSequence(): Sequence<Int> = listOf(1, 2, 3, 4).asSequence()
    .map {
        println("map($it)")
        it * it
    }.filter {
        println("filter($it)")
        it % 2 == 0
    }