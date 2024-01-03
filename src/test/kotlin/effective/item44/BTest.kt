package effective.item44

import org.junit.jupiter.api.Test

class BTest {
    @Test
    fun `명확하지 않은 테스트`() {
        val aInstance = A()
        val bInstance = B()
        bInstance.apply {
            assert(aInstance.test() == 40)
        }
    }

    @Test
    fun `명확하지 않은 업데이트`() {
        val aInstance = A()
        val bInstance = B()
        bInstance.apply {
            aInstance.update()
        }
        assert(aInstance.a == 100)
    }
}