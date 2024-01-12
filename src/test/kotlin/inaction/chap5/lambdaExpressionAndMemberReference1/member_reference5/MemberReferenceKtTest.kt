package inaction.chap5.lambdaExpressionAndMemberReference1.member_reference5

import NsTest
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class MemberReferenceKtTest : NsTest() {
    @Test
    fun testPersonMemberReference() {
        val person = Person("sh1mj1", 25)
        assert(getAge(person) == 25)
    }

    @Test
    fun testTopLevelFun() {
        run(::salute)
        assert(
            output().contains("Salute")
        )
    }

    @Test
    fun testConstructorReference() {
        val createPerson = ::Person
        // 다른 작업들 수행 .......

        val person = createPerson("sh1mj1", 25)
        assert(person == Person("sh1mj1", 25))
    }

    @Test fun testExtensionMemberReference() {
        val isAdult = Person::isAdult
        assertTrue(isAdult(Person("sh1mj1", 25)))
    }

    @Test
    fun testBoundMemberReference() {
        // 기존에는 클래스의 메서드/프로퍼티에 대한 참조를 얻은 후, 참조 호출 시 인스턴스를 인자로 제공해야 했다.
        val p1 = Person("sh1mj1", 25)
        val personAge = Person::age
        assert(personAge(p1) == 25) // p 라는 Person 의 인스턴스를 인자를 제공

        // kotlin 1.1 부터 바운드 멤버 참조 지원
        val p2 = Person("sh1mj1", 25)
        val sh1mj1Age = p2::age // 클래스의 인스턴스를 가지고 멤버 참조를 만들 수 있다.
        assert(sh1mj1Age() == 25) // sh1mj1Age 는 인자가 없는 함수이다.
    }
}