package inaction.chap5.lambdaExpressionAndMemberReference1.lamda_collection2

data class Person(val name: String, val age: Int)

fun findTheOldest1(people: List<Person>): Person? {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    return theOldest
}

fun findTheOldest2(people: List<Person>): Person = people.maxBy { it.age }

fun findTheOldest3(people: List<Person>): Person = people.maxBy(Person::age)


