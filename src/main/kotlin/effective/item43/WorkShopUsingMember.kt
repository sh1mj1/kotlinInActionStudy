package effective.item43

import java.time.LocalDateTime

/**
 * 멤버 함수와 멤버 프로퍼티로 정의
 */
class WorkShopUsingMember(/* 주 프로퍼티 */): WorkShop {

    private val name = "someName"
    // ...

    fun makeEvent(date: LocalDateTime) {
        // ..
        println("event is made on $date!")
    }

    val permalink
        get() = "/workshop/$name"

}