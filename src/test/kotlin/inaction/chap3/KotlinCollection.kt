package inaction.chap3

import org.junit.jupiter.api.Test

class KotlinCollection {

    @Test
    fun printObjectType() {
        val set = hashSetOf(1, 7, 53)
        val list = arrayListOf(1, 7, 53)
        val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

        println(set.javaClass)
        println(list.javaClass)
        println(map.javaClass)
    }

    @Test
    fun moreFeaturesOfKotlinCollection() {
        val string = listOf("first", "second", "third")
        println(string.last()) // 리스트의 마지막 원소를 가져온다

        val numbers = setOf(1, 14, 2)
        println(numbers.max()) // 컬렉션에서 최대 값을 가져온다
    }

    @Test
    fun defaultToStringOfCollection() {
        val list = listOf(1, 2, 3)
        println(list)
    }

    @Test
    fun changeToStringFormatOfCollection() {
        val list = listOf(1, 2, 3)

        println(joinToStringVer1(list, ",", "", ""))
        println(joinToStringVer1(list))
        println(joinToStringVer1(list, "; "))
        println(joinToStringVer1(list, postfix = ";", prefix = "# "))
    }

    @Test
    fun collectionExtension() {
        val strings: List<String> = listOf("first", "second", "fourteenth")
        println(strings.last()) // fourteenth printed

        val numbers: Collection<Int> = setOf(1, 14, 2)
        println(numbers.max()) // 14 printed
    }

}