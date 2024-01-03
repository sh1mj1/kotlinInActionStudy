package effective.item44

interface PhoneBook {
    fun String.isPhoneNumber(): Boolean
}

class Fizz : PhoneBook {
    override fun String.isPhoneNumber(): Boolean = length == 7 && all { it.isDigit() }
}

class PhoneBookIncorrect {
    // ...

    fun String.isPhoneNumber() = length == 7 && all { it.isDigit() } // This is Bad code
}

private fun String.isPhoneNumber() = length == 7 && all { it.isDigit() }


/**
 * 멤버 확장 함수는 래퍼런스를 지원하지 않는다
 */
fun supportReference() {
    val ref = String::isPhoneNumber
    val str = "1234567890"
    val boundedRef = str::isPhoneNumber

    // val refX = PhoneBookIncorrect::isPhoneNumber // 오류
    val book = PhoneBookIncorrect()
    // val boundedRefX = book::isPhoneNumber // 오류
}

class A {
    var a = 10
}

class B {
    var a = 20
    var b = 30
    fun A.test() = a + b // a 에 암묵적 접근을 한다. a 가 A 의 것인지 B 의 것인지 혼동됨
    // 여기서 a 는 클래스 A 의 a 이므로 10 이다.

    fun A.update() {
        a = 100 // A 의 a 를 업데이트할지 B 의 a 를 업데이트할지 혼동됨.
        // 여기서 a 는 클래스 A 의 a 이다.
    }
}