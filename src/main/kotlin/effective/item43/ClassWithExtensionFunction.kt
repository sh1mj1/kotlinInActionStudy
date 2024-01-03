package effective.item43

open class C {
    open fun foo() = "d"
}

class D : C() {
    override fun foo(): String = "d"
}

open class CExtFunc

class DExtFunc : CExtFunc()

fun CExtFunc.foo() = "c"
fun DExtFunc.foo() = "d"