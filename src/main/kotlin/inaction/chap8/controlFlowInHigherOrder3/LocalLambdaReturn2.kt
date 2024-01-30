package inaction.chap8.controlFlowInHigherOrder3

fun lookForAlice3(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

fun lookForAlice4(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach // return@forEach 는 람다식으로부터 리턴시킴
    }
    println("Alice might be somewhere")
}