package inaction.chap4.`object`.normal

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PayrollTest {
    @Test
    fun testPayroll() {
        Payroll.allEmployees.add(Person("sh1mj1"))
        val salary = Payroll.calculateSalary()
        assertTrue(salary == 0)
    }
}