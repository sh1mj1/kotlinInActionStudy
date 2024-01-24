package inaction.chap7.OverloadingArithmeticOperator1

import java.math.BigDecimal

data class Point(var x: Int, var y: Int) {
//    operator fun plus(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }
}

operator fun Point.plus(other: Point): Point = Point(x + other.x, y + other.y)

operator fun Point.times(scale: Double): Point = Point((x * scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int): String = toString().repeat(count)

operator fun Point.plus(i: Int): Point = Point(x + i, y + i)

operator fun Point.plusAssign(i: Int) {
    x += i + i
    y += i + i
}

operator fun Point.unaryMinus(): Point = Point(-x, -y)

operator fun BigDecimal.inc() = this + BigDecimal.ONE