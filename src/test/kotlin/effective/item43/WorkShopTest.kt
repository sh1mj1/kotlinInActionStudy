package effective.item43

import java.time.LocalDateTime

class WorkShopTest {

    fun useWorkshop(workShop: WorkShopUsingMember) {
        val event = workShop.makeEvent(date = LocalDateTime.now())
        val permalink = workShop.permalink

        val makeEventRef = WorkShopUsingMember::makeEvent
        val permalinkRef = WorkShopUsingMember::permalink
    }

    fun useWorkshop(workShop: WorkShopUsingExtension) {
        val event = workShop.makeEvent(date = LocalDateTime.now())
        val permalink = workShop.permalink

        val makeEventRef = WorkShopUsingExtension::makeEvent
        val permalinkRef = WorkShopUsingExtension::permalink
    }
}