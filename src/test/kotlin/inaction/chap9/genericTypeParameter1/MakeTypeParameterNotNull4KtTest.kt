package inaction.chap9.genericTypeParameter1

import org.junit.jupiter.api.Test

class MakeTypeParameterNotNull4KtTest{
    @Test
    fun testProcess() {
        val nullableStringProcessor = Processor<String?>()
        nullableStringProcessor.process(null)
    }
}