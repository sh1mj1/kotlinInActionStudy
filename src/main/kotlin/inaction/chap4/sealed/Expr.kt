package inaction.chap4.sealed

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun evaluate(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> evaluate(e.left) + evaluate(e.right)
        is ExtendExprInSamePackage -> TODO()
        is SomeClass.ExtendExprInSomeClass -> TODO()
    }

sealed interface ExprInterface {
    class Num(val value: Int) : ExprInterface
    class Sum(val left: ExprInterface, val right: ExprInterface) : ExprInterface
}

fun evaluate(e: ExprInterface): Int =
    when (e) {
        is ExprInterface.Num -> e.value
        is ExprInterface.Sum -> evaluate(e.left) + evaluate(e.right)
    }