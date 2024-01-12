package inaction.chap5.lambdaExpressionAndMemberReference1.lamda_collection2

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun testFindTheOldest1() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(findTheOldest1(people) == Person("Bob", 31))
    }

    @Test
    fun testFindTheOldest2() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))
        assert(findTheOldest2(people) == Person("Bob", 31))
    }

    @Test
    fun testFindTheOldest3() {
        val people = listOf(Person("Alice", 29), Person("Bob", 29))
        assert(findTheOldest3(people) == Person("Alice", 29))
    }

}