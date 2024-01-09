package effective.item40.transitive

open class Date(val year: Int, val month: Int, val day: Int) {
    override fun equals(other: Any?): Boolean = when (other) {
        is DateTime -> this == other.date
        is Date -> other.year == year && other.month == month && other.day == day
        else -> false
    }
    // ...
}

class DateTime(val date: Date, val hour: Int, val minute: Int, val second: Int) :
    Date(date.year, date.month, date.day) {
    override fun equals(other: Any?): Boolean = when (other) {
        is DateTime -> other.date == date && other.hour == hour && other.minute == minute && other.second == second
        is Date -> date == other
        else -> false
    }
    // ...
}