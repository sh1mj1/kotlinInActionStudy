package inaction.chap8.controlFlowInHigherOrder3

import org.junit.jupiter.api.Test

class AnonymousFunctions3KtTest {
    private val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Andrew", 33))

    @Test
    fun testLookForAlice5() {
        lookForAlice5(people)
    }

    @Test
    fun testAnonymousFunctionInFilter() {
        people.filter(fun(person) = person.age < 30)
    }

}