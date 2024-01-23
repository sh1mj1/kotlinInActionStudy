package inaction.chap7.OverloadingArithmeticOperator1

data class Point(val x: Int, val y: Int) {
//    operator fun plus(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }
}

operator fun Point.plus(other: Point): Point = Point(x + other.x, y + other.y)

operator fun Point.times(scale: Double): Point = Point((x * scale).toInt(), (y * scale).toInt())

operator fun Char.times(count: Int): String = toString().repeat(count)