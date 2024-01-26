package inaction.chap8.highOrderFunction1

import org.junit.jupiter.api.Test

class ReturningFunctionFromFunction5KtTest {
    @Test
    fun testGetShippingCostCalculator() {
        val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
        assert("Shipping costs ${calculator(Order(3))}" == "Shipping costs 12.3")
        assert(calculator(Order(3)) == 12.3)
    }

    @Test
    fun testGetPredicate() {
        val contacts = listOf(
            Person("Dmitry", "Jemerov", "123-4567"),
            Person("Svetlana", "Isakova", null)
        )
        val contactListFilters = ContactListFilters()
        with(contactListFilters) {
            prefix = "Dm"
            onlyWithPhoneNumber = true
        }
        assert(
            contacts.filter(contactListFilters.getPredicate()) == listOf(
                Person("Dmitry", "Jemerov", "123-4567")
            )
        )
    }
}