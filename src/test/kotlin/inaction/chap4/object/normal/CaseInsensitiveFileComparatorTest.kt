package inaction.chap4.`object`.normal

import org.junit.jupiter.api.Test
import java.io.File

class CaseInsensitiveFileComparatorTest {
    @Test
    fun testCaseInsensitiveFileComparator() {
        val file1 = File("/User")
        val file2 = File("/user")
        assert(CaseInsensitiveFileComparator.compare(file1, file2) == 0)

        val file11 = File("/Z")
        val file22 = File("/a")
        assert(CaseInsensitiveFileComparator.compare(file11, file22) > 1)

        val files = listOf(File("/Z"), File("/a"))
        assert(files.sortedWith(CaseInsensitiveFileComparator) == listOf(File("/a"), File("/Z")))
    }


}