package inaction.chap7.collectionAndRangeConvention3

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> { // 이 객체는 LocalDate 원소에 대한 iterator 를 구현
        var current = start // ClosedRange 의 프로퍼티
        override fun hasNext(): Boolean = current <= endInclusive // compareTo 관례를 사용하여 날짜를 비교

        override fun next(): LocalDate = current.apply { // 현재 날짜를 저장한 후 날짜를 변경. 그 후 저장해둔 날짜를 리턴
            current = plusDays(1) // 현재 날짜를 1일 뒤로 변경
        }
    }
