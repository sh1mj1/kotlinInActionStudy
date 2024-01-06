package effective.item39.tag

/**
 * 테스트에 사용되는 클래스
 * 어떤 값이 기준에 만족하는지를 확인하기 위해 사용한다
 */
class ValueMatcher<T> private constructor(
    val value: T? = null,
    val matcher: Matcher,
) {

    fun match(value: T) = when (matcher) {
        Matcher.EQUAL -> value == this.value
        Matcher.NOT_EQUAL -> value != this.value
        Matcher.LIST_EMPTY -> value is List<*> && value.isEmpty()
        Matcher.LIST_NOT_EMPTY -> value is List<*> && value.isNotEmpty()
    }

    enum class Matcher {
        EQUAL,
        NOT_EQUAL,
        LIST_EMPTY,
        LIST_NOT_EMPTY
    }

    // ValueMatcher 객체를 만드는 팩토리 메서드
    companion object {
        fun <T> equal(value: T) = ValueMatcher(value = value, matcher = Matcher.EQUAL)
        fun <T> notEqual(value: T) = ValueMatcher(value = value, matcher = Matcher.NOT_EQUAL)
        fun <T> emptyList() = ValueMatcher<T>(matcher = Matcher.LIST_EMPTY)
        fun <T> notEmptyList() = ValueMatcher<T>(matcher = Matcher.LIST_NOT_EMPTY)
    }
}

fun <T> ValueMatcher<T>.reversed(): ValueMatcher<T?> = when (this.matcher) {
    ValueMatcher.Matcher.EQUAL -> ValueMatcher.notEqual(this.value)
    ValueMatcher.Matcher.NOT_EQUAL -> ValueMatcher.equal(this.value)
    ValueMatcher.Matcher.LIST_EMPTY -> ValueMatcher.notEmptyList()
    ValueMatcher.Matcher.LIST_NOT_EMPTY -> ValueMatcher.emptyList()
}
