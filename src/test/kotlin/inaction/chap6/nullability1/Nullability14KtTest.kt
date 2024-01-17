package inaction.chap6.nullability1

import org.junit.jupiter.api.Test

class Nullability14KtTest {
    @Test
    fun testStrLen() {
        assert(strLenSafe(null) == 0)
//        strLen(null) // [ERROR] Null can not be a value of a non-null type String
    }

    @Test
    fun testManagerName() {
        val ceo = Employee("Da Boss", null)
        val developer = Employee("Bob Smith", ceo)
        assert(managerName(developer) == ceo.name)
        assert(managerName(ceo) == null)
    }

    @Test
    fun testCountryName() {
        val person = inaction.chap6.nullability1.safeCast4.Person("Dmitry", null)
        assert(person.countryName() == "Unknown")
    }

    @Test
    fun testPrintShippingLabel() {
        val address = Address("Elseter. 47", 80687, "Munich", "Germany")
        val jetbrains = Company("JetBrains", address)
        val person = inaction.chap6.nullability1.safeCast4.Person("Dmitry", jetbrains)
        printShippingLabel(person)
    }
}