package effective.item41

import org.junit.jupiter.api.Test

class ProperTest {
    @Test
    fun testProper() {
        val properSet = List(10000) { Proper("$it") }.toSet()
        println(Proper.equalsCounter) // 0. 모두 다른 bucket 에 들어가서 equals 를 호출할 필요가 없었다.
        val terribleSet = List(10000) { Terrible("$it") }.toSet()
        println(Terrible.equalsCounter) // 50116443.
        println()

        Proper.equalsCounter = 0
        println(Proper("9999") in properSet) // true
        println(Proper.equalsCounter) // 1 // 9999 로 만들어진 해시코드에 매칭되는 bucket 을 찾고, equals 를 호출
        println()

        Proper.equalsCounter = 0
        println(Proper("A") in properSet) // false // "A" 로 만들어진 해시코드가 없기 때문에 equals 호출하지 않아도 false 임을 안다
        println(Proper.equalsCounter) // 0
        println()

        Terrible.equalsCounter = 0
        println(Terrible("9999") in terribleSet) // true
        println(Terrible.equalsCounter) // 7535 // 모든 해시코드가 같아 모든 데이터가 한 bucket 에 있어서 equals 를 굉장히 많이 호출
        println()

        Terrible.equalsCounter = 0
        println(Terrible("A") in terribleSet) // false
        println(Terrible.equalsCounter) // 10001
    }
}