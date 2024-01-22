package effective.item4

import org.junit.jupiter.api.Test

class ZebraTest {
    @Test
    fun testAnimalZebra() {
//        var animal = Zebra()
//        animal = Animal() // [Compile Error] Type mismatch: inferred type is Animal but Zebra was expected

        var animal: Animal = Zebra() // 타입 명시
        animal = Animal() // 성공
    }
}