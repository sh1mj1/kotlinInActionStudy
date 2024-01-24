package inaction.chap7.delegatedProperty5.lateInitProperty2

/*

class Foo {
    private val delegate = Delegate()
    var p : Type
        set(value: Type) = delegate.setValue()... , value)
        get() = delegate.getValue(...)
}
*/

class Email { /* ... */ }

// DB 에서 이메일을 가져오는 함수
fun loadEmails(person: Person): List<Email> {
    println("${person.name} 의 이메일 가져옴")
    return listOf(/* ... */)
}

/*
class Person(val name: String) {
    private var _emails: List<Email>? = null // 데이터를 저장하고 emails 의 위임 객체 역할을 하는 _emails 프로퍼티 (backing property)
    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this) // 최초 접근 시 이메일을 가져옴.
            }
            return emails // 저장해둔 데이터가 있으면 그 데이터를 반환.
        }
}
*/

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}