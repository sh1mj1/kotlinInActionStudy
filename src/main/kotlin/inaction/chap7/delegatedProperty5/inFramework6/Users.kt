package inaction.chap7.delegatedProperty5.inFramework6

// Exposed 프레임워크/라이브러리 사용
/*
object Users : IdTable() { // 이 객체는 DB table 이다.
    // 아래 프로퍼티들은 테이블의 칼럼이다.
    val name = varchar("name", length = 50).index()
    val age = integer("age")
}

// 각 User 인스턴스는 테이블에 들어있는 구체적인 엔티티에 해당한다.
class User(id: EntityID) : Entity(id) { // 사용자 이름은 DB 의 "name" 칼럼에 들어있다.
    var name: String by Users.name
    var age: Int by Users.age
}

 */