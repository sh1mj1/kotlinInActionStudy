package inaction.chap9.variance3

import org.junit.jupiter.api.Test

class Covariance3KtTest {
    @Test
    fun testComparator() {
        val anyComparator = Comparator<Any> { e1, e2 ->
            e1.hashCode() - e2.hashCode()
        }

        val strings: List<String> = listOf("cde", "abc")
        strings.sortedWith(anyComparator) // 구체 타입의 객체를 비교하기 위해 모든 객체를 비교하는 Comparator 를 사용할 수 있다.
        print(strings)
    }
}