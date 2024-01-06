package inaction.chap4.sealed


import inaction.chap4.sealed.Expr.Num
import inaction.chap4.sealed.Expr.Sum
import org.junit.jupiter.api.Test

class ExprKtTest {
    @Test
    fun evaluateTest() {
        assert(evaluate(Sum(Sum(Num(1), Num(2)), Num(4))) == 7)
    }
}