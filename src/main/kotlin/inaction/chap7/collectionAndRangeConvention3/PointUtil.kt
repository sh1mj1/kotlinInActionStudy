package inaction.chap7.collectionAndRangeConvention3

import inaction.chap7.OverloadingArithmeticOperator1.Point

// get 연산자 함수를 정의
operator fun Point.get(index: Int): Int = when (index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}