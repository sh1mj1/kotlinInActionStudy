package inaction.chap7.collectionAndRangeConvention3

import inaction.chap7.OverloadingArithmeticOperator1.Point

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean =
    p.x in upperLeft.x..<lowerRight.x && p.x in upperLeft.y..<lowerRight.y