package inaction.chap7.OverloadingArithmeticOperator1.binary1

import inaction.chap7.OverloadingArithmeticOperator1.Point
import inaction.chap7.OverloadingArithmeticOperator1.plus
import inaction.chap7.OverloadingArithmeticOperator1.plusAssign
import inaction.chap7.OverloadingArithmeticOperator1.times
import org.junit.jupiter.api.Test

class PointTest {
    @Test
    fun testPointPlus() {
        val p1 = Point(10, 20)
        val p2 = Point(30, 40)
        assert(p1 + p2 == Point(40, 60))
    }

    @Test
    fun testPointTimes() {
        val p = Point(10, 20)
        assert(p * 1.5 == Point(15, 30))
    }

    @Test
    fun testTimesToString() {
        assert('a' * 3 == "aaa")
    }

    @Test
    fun testPlusCompoundAssignment1() {
        var point = Point(1, 2)
        point += Point(3, 4)
        assert(point == Point(4, 6))
    }

    @Test
    fun addElementInArrayList() {
        val numbers = ArrayList<Int>()
        numbers += 42
        assert(numbers[0] == 42)
    }

    @Test
    fun normalOperatorPlusPoint() {
        var p = Point(10, 20)
        p = p.plus(1)
        assert(p == Point(11, 21))
    }

    @Test
    fun normalOperatorPlusAssignPoint() {
        val p = Point(10, 20)
        p.plusAssign(1)
        assert(p == Point(12, 22))
    }

    @Test
    fun useValToRemoveAmbiguity() {
//        var p = Point(10, 20) // p 가 var 임. 변경 가능이어서 plus 와 plusAssign 둘다 호출 가능해짐.. ambiguity 발생.
//        p += 1 // [COMPILE ERROR] Assignment operators ambiguity

// --    p 가 val 임.. 변경 불가. 그래서 오직 plusAssign 만 호출 가능해짐.
        val p = Point(10, 20)
        p += 1
        assert(p == Point(12, 22))
    }

    @Test
    fun testCollectionOperator() {
        val list = arrayListOf(1, 2)
        list += 3
        assert(list == arrayListOf(1, 2, 3))

        val newList = list + listOf(4, 5)
        assert(newList == listOf(1, 2, 3, 4, 5))
    }
}