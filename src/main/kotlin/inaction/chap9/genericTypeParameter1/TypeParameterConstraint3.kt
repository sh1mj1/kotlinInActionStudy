package inaction.chap9.genericTypeParameter1

fun <T : Number> oneHalf(value: T): Double = // Number 를 타입 파라미터 상한으로 정한다.
    value.toDouble() / 2.0  // Number 클래스에 정의된 메서드를 호출한다.

fun <T : Comparable<T>> max(first: T, second: T): T = // 이 함수의 인자들은 비교 가능해야 한다.
    if (first > second) first else second

fun <T> ensureTailingPeriod(seq: T)
        where T : CharSequence, T : Appendable { // 타입 파라미터 제약 목록
    if (!seq.endsWith('.')) { // CharSequence 인터페이스의 확장 함수를 호출
        seq.append('.') // Appendable 인터페이스의 메서드를 호출
    }
}