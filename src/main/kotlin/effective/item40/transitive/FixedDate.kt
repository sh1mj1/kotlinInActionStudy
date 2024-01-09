package effective.item40.transitive

class FixedDate(val year: Int, val month: Int, val day: Int) {
    override fun equals(other: Any?): Boolean {
        if (other !is FixedDate) {
            return false
        }
        return year == other.year && month == other.month && day == other.day

    }
}

class FixedDateTime(val date: FixedDate, val hour: Int, val minute: Int, val second: Int) {
    override fun equals(other: Any?): Boolean {
        if (other !is FixedDateTime) {
            return false
        }
        return date == other.date && hour == other.hour && minute == other.minute
    }
}

