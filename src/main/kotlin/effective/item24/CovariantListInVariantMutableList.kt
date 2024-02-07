package effective.item24

import effective.item24.covariance.Dog
import effective.item24.covariance.Puppy

fun appendAny(list: MutableList<Any>) {
    list.add(42)
}

fun appendAnyToStrings() {
    val strs = mutableListOf<String>("A", "B")
    // 코틀린에서는 사용 불가능한 코드
//    appendAny(strs) // Type mismatch: inferred type is MutableList<String> but MutableList<Any> was expected
}

fun appendDog(list: MutableList<Dog>) {
    list.add(Dog())
}

fun appendDogToPuppies() {
    val puppies = mutableListOf<Puppy>(Puppy())
    // 코틀린에서는 사용 불가능한 코드
//    appendDog(puppies) // Type mismatch: inferred type is MutableList<Puppy> but MutableList<Dog> was expected
}