package inaction.chap2.expr

import org.junit.jupiter.api.Test

class EvaluatorKtTest {

    @Test
    fun evaluateTest() {
        println(evaluate(Sum(Sum(Num(1), Num(2)), Num(4))))
    }
}