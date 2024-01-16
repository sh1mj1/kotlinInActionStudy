package inaction.chap5.samInterface4.samConstructor2

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All don!") }
}

