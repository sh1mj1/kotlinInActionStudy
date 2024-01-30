package inaction.chap8.controlFlowInHigherOrder3

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun lookForAlice2(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

// 인라인 함수 예제
inline fun inlineExample(action: () -> Unit) {
    println("Before Lambda")
    action()
    println("After Lambda")
}

// 비인라인 함수 예제
fun nonInlineExample(action: () -> Unit) {
    println("Before Lambda")
    action()
    println("After Lambda")
}