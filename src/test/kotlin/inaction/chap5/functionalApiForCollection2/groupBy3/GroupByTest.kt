package inaction.chap5.functionalApiForCollection2.groupBy3

import inaction.chap5.Person
import org.junit.jupiter.api.Test

class GroupByTest {
    @Test
    fun testGroupBy() {
        val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
        println(people.groupBy { it.age }) // print /* {31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]} */
        assert(
            people.groupBy(Person::age) == mapOf(
                31 to listOf(Person("Alice", 31), Person("Carol", 31)),
                29 to listOf(Person("Bob", 29))
            )
        )

        val list = listOf("a", "ab", "b")
        println(list.groupBy { it.first() }) // print /* {a=[a, ab], b=[b]} */
        assert(
            list.groupBy(String::first) == mapOf(
                'a' to listOf("a", "ab"), 'b' to listOf("b")
            )
        )
    }

    @Test
    fun testGroupingByEachCount() {
        val words = listOf("a", "abc", "ab", "def", "abc")
        val counts = words.groupingBy { it.first() }.eachCount()
        println(counts) // print /* {a=4, d=1} */
        assert(
            counts == mapOf('a' to 4, 'd' to 1)
        )
    }

    @Test
    fun testGroupingByFold() {
        val numbers = listOf("one", "two", "three", "four", "five")
        val lengths = numbers.groupingBy { it.first() }.fold(initialValue = 0) { acc, s -> acc + s.length }
        println(lengths) // print /* {o=3, t=8, f=8} */
        assert(
            lengths == mapOf('o' to 1, 't' to 8, 'f' to 4)
        )
    }

    @Test
    fun testGroupingByReduce() {
        val numbers = listOf("one", "two", "three", "four", "five")
        val concatenated = numbers.groupingBy { it.first() }.reduce { _, accumulator, element -> accumulator + element }
        println(concatenated) // print /* {o=one, t=twothree, f=fourfive} */
        assert(concatenated == mapOf('o' to "one", 't' to "twothree", 'f' to "fourfive"))
    }

    @Test
    fun testGroupingByAggregate() {
        val numbers = listOf("one", "two", "three", "four", "five")
        val aggregated = numbers.groupingBy { it.first() }.aggregate { _, accumulator: String?, element, first ->
            if (first) element else accumulator + element
        }
        println(aggregated) // print /* {o=one, t=twothree, f=fourfive} */
        assert(aggregated == mapOf('o' to "one", 't' to "twothree", 'f' to "fourfive"))
    }

    @Test
    fun testGroupingByFoldTo() {
        val words = listOf("a", "bc", "def", "ghij")
        val lengths = mutableMapOf<Char, Int>()
        words.groupingBy { it.first() }.foldTo(lengths, 0) { acc, s -> acc + s.length }

        println(lengths) // print /* {a=1, b=2, d=3, g=4} */
        assert(lengths == mapOf('a' to 1, 'b' to 2, 'd' to 3, 'g' to 4))
    }
}