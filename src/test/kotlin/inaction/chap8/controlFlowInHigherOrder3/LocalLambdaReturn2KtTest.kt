package inaction.chap8.controlFlowInHigherOrder3

import org.junit.jupiter.api.Test

class LocalLambdaReturn2KtTest {
    private val people = listOf(Person("Alice", 29), Person("Bob", 31))

    @Test
    fun testLookForAlice3() {
        lookForAlice3(people)
    }

    @Test
    fun testLookForAlice4() {
        lookForAlice4(people)
    }

    @Test
    fun testReceiverLabel() {
        assert(
            StringBuilder().apply sb@{ // this@sb 를 통해 이 람다의 묵시적 수신 객체에 접근 가능
                listOf(1, 2, 3).apply { // this 는 이 위치를 둘러싼 가장 안쪽 영역의 묵시적 수신 객체를 가리킨다.
                    this@sb.append(this.toString()) // 모든 묵시적 수신 객체를 사용할 수 있다. 다만 바깥쪽 묵시적 수신 객체에 접근할 때는 레이블을 명시해야 한다.
                }
            }
                .toString() == "[1, 2, 3]")
    }
}