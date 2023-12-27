package inaction.chap2.expr


fun evaluate(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evaluate(e.right) + evaluate(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }


fun evaluateWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evaluateWithLogging(e.left)
            val right = evaluateWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
