package inaction.chap5.lambdaExpressionAndMemberReference1.lamda_format3

import inaction.chap5.lambdaExpressionAndMemberReference1.lamda_collection2.Person
import org.junit.jupiter.api.Test

class LamdaFormatKtTest {
    @Test
    fun testSum1() = assert(sum(1, 2) == 3)

    @Test
    fun basicFormat() {
        assert(
            people.maxBy { p: Person -> p.age } == Person("Bob", 31)
        )
    }

    @Test
    fun typeInference() {
        assert(
            people.maxBy { p -> p.age } == Person("Bob", 31)
        )
    }

    @Test
    fun useDefaultParameter() {
        assert(
            people.maxBy { it.age } == Person("Bob", 31)
        )
    }

    @Test
    fun saveLambdaInVal() {
        val getAge = { p: Person -> p.age }
        assert(
            people.maxBy(getAge) == Person("Bob", 31)
        )
    }

    @Test fun multilineLambda() {
        val sum = { x: Int, y: Int ->
            println("Computing the sum of $x and $y")
            x + y
        }
        assert(sum(1, 2) == 3)
    }


    @Test
    fun testJoinToString1() {
        val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
        assert(names == "Alice Bob")
    }

    @Test
    fun testJoinToString2() {
        val names = people.joinToString(separator = " ") { p: Person -> p.name }
        assert(names == "Alice Bob")
    }

}