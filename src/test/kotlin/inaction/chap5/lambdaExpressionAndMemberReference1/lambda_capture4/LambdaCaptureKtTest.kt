package inaction.chap5.lambdaExpressionAndMemberReference1.lambda_capture4

import NsTest
import org.junit.jupiter.api.Test

class LambdaCaptureKtTest : NsTest() {

    @Test
    fun testPrintMessagesWithPrefix() {
        val errors = listOf("403 Forbidden", "404 Not Found")
        printMessagesWithPrefix(errors, "Error: ")
        assert(
            output().contains(
                """
                Error:  403 Forbidden
                Error:  404 Not Found
            """.trimIndent()
            )
        )
    }

    @Test
    fun testPrintProblemCounts() {
        val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
        printProblemCounts(responses)
        assert(
            output().contains(
                "1 client errors, 1 server errors, [200 OK, 418 I'm a teapot, 500 Internal Server Error]"
            )
        )
    }
}