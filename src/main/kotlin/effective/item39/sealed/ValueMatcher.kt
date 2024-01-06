package effective.item39.sealed

/**
 * 테스트에 사용되는 클래스
 * 어떤 값이 기준에 만족하는지를 확인하기 위해 사용한다
 */
sealed interface ValueMatcher<T> {
    fun match(value: T): Boolean

    class Equal<T>(val value: T) : ValueMatcher<T> {
        override fun match(value: T): Boolean = value == this.value
    }

    class NotEqual<T>(val value: T) : ValueMatcher<T> {
        override fun match(value: T): Boolean = value != this.value
    }

    class EmptyList<T>(val value: T) : ValueMatcher<T> {
        override fun match(value: T): Boolean = value is List<*> && value.isEmpty()
    }

    class NotEmptyList<T>(val value: T) : ValueMatcher<T> {
        override fun match(value: T): Boolean = value is List<*> && value.isNotEmpty()
    }
}

fun <T> ValueMatcher<T>.reversed(): ValueMatcher<T> = when (this) {
    is ValueMatcher.Equal -> ValueMatcher.NotEqual(value)
    is ValueMatcher.NotEqual -> ValueMatcher.Equal(value)
    is ValueMatcher.EmptyList -> ValueMatcher.NotEmptyList(value)
    is ValueMatcher.NotEmptyList -> ValueMatcher.EmptyList(value)
}