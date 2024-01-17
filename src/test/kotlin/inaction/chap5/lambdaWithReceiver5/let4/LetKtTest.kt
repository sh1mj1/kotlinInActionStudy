package inaction.chap5.lambdaWithReceiver5.let4

import org.junit.jupiter.api.Test

class LetKtTest {
    @Test
    fun testLet() {
        assert(letFunc() == "[5, 4, 4]")
    }

    @Test
    fun testLetFunc2(){
        letFunc2()
    }

    @Test
    fun testLetNullCheck(){
        letNullCheck()
    }
}