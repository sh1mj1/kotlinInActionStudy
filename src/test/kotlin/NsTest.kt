import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.PrintStream

abstract class NsTest {
    private var standardOut: PrintStream? = null
    private var captor: OutputStream? = null

    @BeforeEach
    protected fun init() {
        standardOut = System.out
        captor = ByteArrayOutputStream()
        System.setOut(PrintStream(captor))
    }

    @AfterEach
    protected fun printOutput() {
        System.setOut(standardOut)
        println(output())
    }

    protected fun output(): String = captor.toString().trim { it <= ' ' }
}
