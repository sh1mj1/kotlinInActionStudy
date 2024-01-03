package effective.item43

import org.junit.jupiter.api.Test

class ClassWithExtensionFunctionTest {

    @Test
    fun `멤버 함수는 자식 클래스에서 오버라이드할수 있다`() {
        val d = D()
        assert(d.foo() == "d")

        val c: C = d // 정적 타입: C, 동적 타입: D
        assert(c.foo() == "d")

        assert(D().foo() == "d")
        assert((D() as C).foo() == "d") // 정적 타입: C, 동적 타입: D
    }

    @Test
    fun `확장 함수는 자식 클래스에서 오버라이드할수 없다`() {
        val dExtFunc = DExtFunc()
        assert(dExtFunc.foo() == "d")

        val cExtFunc: CExtFunc = dExtFunc // 정적 타입: CExtFunc, 동적 타입: DExtFunc
        assert(cExtFunc.foo() == "c")

        assert(DExtFunc().foo() == "d")
        assert((DExtFunc() as CExtFunc).foo() == "c") // 정적 타입: CExtFunc, 동적 타입: DExtFunc
    }

}