package effective.item43

import java.time.LocalDateTime

/**
 * 확장 함수와 확장 프로퍼티로 정의
 */
class WorkShopUsingExtension(/* 주 프로퍼티 */) : WorkShop {

    // ...
}

const val name = "someName"

fun WorkShopUsingExtension.makeEvent(date: LocalDateTime) {
    // ..
    println("event is made on $date!")
}

val WorkShopUsingExtension.permalink
    get() = "/workshop/$name"
