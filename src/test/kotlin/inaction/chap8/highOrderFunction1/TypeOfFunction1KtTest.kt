package inaction.chap8.highOrderFunction1

import org.junit.jupiter.api.Test
import kotlin.test.assertNull

class TypeOfFunction1KtTest {

    @Test
    fun testLambda() {
        assert(sum(1, 2) == 3)
        action // print /* 42 */
        assertNull( canReturnNull(1,2) )
        assertNull(funOrNull?.let { it(1,2) })
    }

    @Test
    fun testPerformRequest() {
        val url = "http://kotl.in"
        performRequest(url) { code, content ->
            assert(code == 200)
            assert(content == "this is the response content")
        }
    }
}