package inaction.chap5.lazyCollectionOperationSequence3.generateSequence2

import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertTrue

class GenerateSequenceKtTest {
    @Test
    fun testGenerateSequence() {
        val naturalNumbers = generateSequence(0) { it + 1 } // 시퀀스
        val numbersTo100 = naturalNumbers.takeWhile { it <= 100 } // 시퀀스
        assert(numbersTo100.sum() == 5050) // sum 이 최종 연산.
    }

    fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden }

    @Test fun findHiddenFileInParentDir() {
        val file = File("/Users/sh1mj1/.HiddenDir/a.txt")
        assertTrue(file.isInsideHiddenDirectory())
    }
}