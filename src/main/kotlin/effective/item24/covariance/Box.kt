package effective.item24.covariance

// 만약 covariant 타입 파라미터가 in 위치에서 사용된다면
class Box<out T> {

    private var value: T? = null

    // 코틀린에서는 이렇게 사용 불가.
    // Type parameter T is declared as 'out' but occurs in 'in' position in type T
//    fun set(value: T) {
//        this.value = value
//    }
    fun get(): T = value ?: error("Value not set")
}


// private 한정자라면, 가능하다
class SafeBox<out T> {
    private var value: T? = null

    private fun set(value: T) {
        this.value = value
    }

    fun get(): T = value ?: error("Value not set")
}