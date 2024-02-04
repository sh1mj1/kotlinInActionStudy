package inaction.chap9.variance3

import org.junit.jupiter.api.Test

class PassingAnArgumentToFunction1KtTest {
    @Test
    fun testPrintContents() = printContents(listOf("abc", "bac"))

    @Test
    fun testAddAnswer() {
        val strings = mutableListOf("abc", "bac")
//        addAnswer(strings) // 이 줄이 컴파일된다면
        println(strings.maxBy { it.length }) // 런타임에 여기서 예외가 발생할 것임.
    }
}