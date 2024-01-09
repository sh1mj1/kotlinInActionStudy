package effective.item40.consistent

import org.junit.jupiter.api.Test
import java.net.URL
import kotlin.test.assertTrue

class URLTest {
    @Test
    fun testUrl() {
        val enWiki = URL("https://en.wikipedia.org/")
        val wiki = URL("https://wikipedia.org/")
        assertTrue { enWiki == wiki }
    }

}