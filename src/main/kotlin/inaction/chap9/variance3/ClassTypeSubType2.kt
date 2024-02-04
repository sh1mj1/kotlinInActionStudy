package inaction.chap9.variance3

fun test(i: Int){
    val n: Number = i // Int 가 Number 의 하위 타입이어서 컴파일된다.
    fun f(s: String) { /* ... */}
//    f(i) // Int 가 String 의 하위 타입이 아니어서 컴파일 안됨. [COMPILE ERROR] Type mismatch: inferred type is Int but String was expected
}