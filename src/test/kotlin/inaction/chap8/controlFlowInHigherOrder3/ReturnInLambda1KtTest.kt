package inaction.chap8.controlFlowInHigherOrder3

import org.junit.jupiter.api.Test

class ReturnInLambda1KtTest {
    private val people = listOf(Person("Alice", 29), Person("Bob", 31))

    @Test
    fun testLookForAlice() {
        lookForAlice(people)
    }

    @Test
    fun testLookForAlice1() {
        lookForAlice2(people)
    }

    @Test
    fun inlineFunctionLambdaReturn() {
        // 인라인 함수 저장 -> 호출
        val delayedLambda = inlineExample {
            println("Inside Lambda")
            return
        }
        println("after save lambda")
        return delayedLambda
    }
    // print
    /*
    Before Lambda
    Inside Lambda
     */

    @Test
    fun non_inlineFunctionLambdaReturn() {
        // 비인라인 함수 저장
        val delayedLambda = nonInlineExample {
            println("Inside Lambda")
//             return  // 주석 해제 시  [COMPILE ERROR] 'return' is not allowed here
        }

        println("after save lambda")

        return delayedLambda
    }
    // print
    /*
    Before Lambda
    Inside Lambda
    After Lambda
    after save lambda
     */
}
