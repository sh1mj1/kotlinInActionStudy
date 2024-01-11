package inaction.chap5.lambda_capture1_4

class KotlinCaptureNonFinal {
    class Ref<T>(var value: T)

    fun captureNonFinal(): Int {
        val counter = Ref(0)
        val inc = { counter.value++ }
        run(inc)

        return counter.value
    }
}

class KotlinCaptureNonFinal2 {
    fun captureNonFinal(): Int {
        var counter = 0
        val inc = { counter++ }
        run(inc)
        return counter
    }
}