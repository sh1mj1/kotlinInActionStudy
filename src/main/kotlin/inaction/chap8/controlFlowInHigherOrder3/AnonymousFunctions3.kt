package inaction.chap8.controlFlowInHigherOrder3

fun lookForAlice5(people: List<Person>) {
    people.forEach(fun(person) { // 람다 식 대신 익명 함수를 사용한다
        if (person.name == "Alice") return // return 은 가장 가까운 함수를 가리킨다 이 위치에서 가장 가까운 함수는 익명 함수이다.
        println("${person.name} is not Alice")
    })
}