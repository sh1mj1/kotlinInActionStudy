package effective.item40.reflexive

/**
 * Reflexive 하지 않은 equals 구현의 예
 */
class Time(
    val millisArg: Long = -1,
    val isNow: Boolean = false,
) {
    val milis: Long
        get() =
            if (isNow) System.currentTimeMillis()
            else millisArg

    override fun equals(other: Any?): Boolean =
        other is Time && milis == other.milis
}