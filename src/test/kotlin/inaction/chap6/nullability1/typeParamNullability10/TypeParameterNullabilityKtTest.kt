package inaction.chap6.nullability1.typeParamNullability10

import org.junit.jupiter.api.Test

class TypeParameterNullabilityKtTest {
    @Test
    fun testPrintHashCode1() {
        printHashCode1(null)
    }

    @Test
    fun testPrintHashCode2() {
//        printHashCode2(null) // [Compile ERROR] Null can not be a value of a non-null type TypeVariable(T)
    }
}