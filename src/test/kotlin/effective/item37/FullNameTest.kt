package effective.item37

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class FullNameTest {

    private fun String.parseName1(): Pair<String, String>? {
        val indexOfLastSpace = this.trim().lastIndexOf(' ')
        if (indexOfLastSpace < 0) return null
        val firstName = this.take(indexOfLastSpace)
        val lastName = this.drop(indexOfLastSpace).trim()
        return Pair(firstName, lastName)
    }

    @Test
    fun testUsingPair() {
        val fullName = "Tom Jackson"
        val (firstName, lastName) = fullName.parseName1() ?: return
        assertTrue { firstName == "Tom" }
        assertTrue { lastName == "Jackson" }
    }

    private fun String.parseName2(): FullName? {
        val indexOfLastSpace = this.trim().lastIndexOf(' ')
        if (indexOfLastSpace < 0) return null
        val firstName = this.take(indexOfLastSpace)
        val lastName = this.drop(indexOfLastSpace).trim()
        return FullName(firstName, lastName)
    }

    @Test
    fun testUsingFullName() {
        val fullName = "Tom Jackson"
        val (firstName, lastName) = fullName.parseName2() ?: return
        assertTrue { firstName == "Tom" }
        assertTrue { lastName == "Jackson" }
    }
}