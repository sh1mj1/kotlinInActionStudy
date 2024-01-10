package inaction.chap4.`object`.normal

object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary(): Int {
        for (person in allEmployees) {
            // ...
        }
        return 0
    }
}


