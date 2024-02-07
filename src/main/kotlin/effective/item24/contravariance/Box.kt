package effective.item24.contravariance

class Box<in T>(
    // 코틀린에서는 이렇게 사용 불가.
    private val value: T
)