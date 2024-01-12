package inaction.chap5.lazyCollectionOperationSequence3.sequenceEvaluation1

import inaction.chap5.Person
import org.junit.jupiter.api.Test

class SequenceEvaluation1KtTest {
    @Test
    fun testJustSequence() = assert(justSequence() is Sequence)

    @Test
    fun testSequenceToList() = assert(justSequence().toList() is List)

    @Test
    fun testSequence() {
        assert(
            listOf(1, 2, 3, 4).asSequence()
                .map { it * it }.find { it > 3 } == 4
        )
    }

    private val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Carles", 32), Person("Dan", 2131))

    @Test
    fun peopleNameIsShortThan4_1() = assert(
        people.asSequence().map(Person::name)
            .filter { it.length < 4 }.toList() == listOf("Bob", "Dan")
    )

    @Test
    fun peopleNameIsShortThan4_() = assert(
        people.asSequence().filter { it.name.length < 4 }
            .map(Person::name).toList() == listOf("Bob", "Dan")
    )


}