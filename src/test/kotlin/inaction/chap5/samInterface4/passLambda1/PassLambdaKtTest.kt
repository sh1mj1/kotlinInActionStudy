package inaction.chap5.samInterface4.passLambda1

import org.junit.jupiter.api.Test

class PassLambdaKtTest {
    @Test
    fun testPassLambda() {
        Postpone.postponeComputation(1000) { println(42) }

        val runnable = Runnable { println(42) }
        fun handleComputation() {
            Postpone.postponeComputation(1000, runnable)
        }

        fun handleComputation(id: String) { // 람다 안에서 id 변수를 캡처함
            Postpone.postponeComputation(1000) { println(id) } // handleComputation 을 호출할 때마다 새 Runnable 인스턴스 생성
        }

        handleComputation()
        handleComputation("10")
    }

}