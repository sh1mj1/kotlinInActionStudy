package inaction.chap2.expr

import org.junit.jupiter.api.Test

class SmartCastKtTest {

    @Test
    fun smartCastValLocalTest() {
        smartCastValLocal()
    }

    @Test
    fun smartCastValPropertyTest(){
        SmartCastValProperty().printData()
    }

    @Test
    fun smartCastVarLocalTest(){
        smartCastVarLocal()
    }

    @Test
    fun smartCastVarPropertyTest(){
        SmartCastVarProperty().printData()
        // 런타임 전에 컴파일 타임 오류
    }

    @Test
    fun castVarPropertyTest(){
        CastVarProperty().printData() // 명시적 캐스팅
    }

}