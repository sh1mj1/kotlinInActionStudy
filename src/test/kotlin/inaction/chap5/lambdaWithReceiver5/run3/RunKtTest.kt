package inaction.chap5.lambdaWithReceiver5.run3

import org.junit.jupiter.api.Test

class RunKtTest {
    @Test
    fun testRun() {
        assert(runFunc() == "Result for query 'Default request to port 8080'")
    }
    @Test
    fun testRunSafeCall(){
        runSafeCall()
    }


}