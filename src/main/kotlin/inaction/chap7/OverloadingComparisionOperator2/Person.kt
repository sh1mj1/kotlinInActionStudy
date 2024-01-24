package inaction.chap7.OverloadingComparisionOperator2

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int =
        compareValuesBy(this, other, Person::lastName, Person::firstName) // 인자로 받은 함수를 차레로 호출하면서 값 비교
}