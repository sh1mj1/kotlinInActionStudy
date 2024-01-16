package effective.item49

import org.junit.jupiter.api.Test

class SequenceKtKtTest {
    @Test
    fun testClassicStatement() = classicStatement()

    @Test
    fun testSequenceSum() {
        val sequenceSum = (1..1000)
            .asSequence()
            .map { it * 3 }
            .filter { it % 2 == 0 }
            .sum()
        println(sequenceSum)
    }

    @Test
    fun take10() {
        generateSequence(1) { it + 1 }
            .map { it * 2 }
            .take(10) // 10개를 계산한다
            .forEach { print("$it, ") }
    }

    @Test
    fun testSeqSumFunc() {
        println(seqSumFunc())
    }

    @Test
    fun testFibonacci() {
        println(fibonacciInfiniteSequence.take(10).toList())
    }

    @Test
    fun testSingleStepSequenceProcessing() {
        println(singleStepSequenceProcessing())
    }

    @Test
    fun testSingleStepListPrecessing() {
        println(singleStepListPrecessing())
    }

}