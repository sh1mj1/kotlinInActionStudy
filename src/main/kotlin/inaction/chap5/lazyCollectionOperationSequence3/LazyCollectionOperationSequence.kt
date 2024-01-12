package inaction.chap5.lazyCollectionOperationSequence3

import inaction.chap5.Person

fun notSequence(people: List<Person>): List<String> = people.map(Person::name).filter { it.startsWith('A') }

fun useSequence(people: List<Person>): List<String> =
    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith('A') }
        .toList()