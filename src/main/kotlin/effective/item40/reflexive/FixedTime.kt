package effective.item40.reflexive

sealed class FixedTime
class TimePoint(val millis: Long) : FixedTime() {
    override fun equals(other: Any?): Boolean {
        if (other !is TimePoint) {
            return false
        }
        return millis == other.millis
    }
}

class Now : FixedTime() {
    val millis = System.currentTimeMillis()
    override fun equals(other: Any?): Boolean {
        if (other !is Now) {
            return false
        }
        return millis == other.millis
    }
}